package Classes;

import Classes.Estados.*;
import Classes.Exceptions.ErroLexicoException;
import Enums.TipoTokenEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Feito por Almir Philipe de Arruda matrícula 201635039
 * Vinícius de Castro Sampaio matrícula 201635002
 **/

public class AnalisadorLexico {
    /**
     * Lista de tokens
     */
    private List<Token> tokenList = new ArrayList<>();

    /**
     * Dicionário de estados do automato
     */
    private HashMap<Integer, Estado> estados = new HashMap<Integer, Estado>();

    /**
     * Input de entrada (arquivo)
     */
    private String entrada;

    /**
     * Posição da leitura do arquivo
     */
    private int entradaPosicao;

    /**
     * Quantidade de colunas e linhas do arquivo
     */
    private List<Integer> MapeandoColunas = new ArrayList<Integer>();

    /**
     * Input de entrada separado em caracteres
     */
    private List<Character> charsEntrada;

    /**
     * Função de build que deve receber a entrada e gera  a lista de tokens
     **/
    public void buildAnalisador(String entrada) throws ErroLexicoException {
        this.entrada = entrada;
        charsEntrada = entrada.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        this.MapearColunas();
        this.instanciaEstados();
        entradaPosicao = -1;
        analisaEntrada();
    }

    /**
     * Função que armazena em estrutura de dados a quantidade
     * de colunas em cada linha do arquivo
     */
    private void MapearColunas() {
        Integer pointerAux = 0;
        Integer countAux = 0;

        while (pointerAux < charsEntrada.size()) {
            char caracterAux = charsEntrada.get(pointerAux);
            if (caracterAux != '\n') {
                countAux++;
            } else {
                countAux++;
                this.MapeandoColunas.add(countAux);
                countAux = 0;
            }
            pointerAux++;
        }

        this.MapeandoColunas.add(countAux);
    }

    /**
     * Função que realiza iteração dentro do array de caracteres
     * e realiza leitura caracter por caracter
     */
    private boolean nextChar() {
        if (entradaPosicao < entrada.length() - 1) {
            entradaPosicao++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Função responsável por voltar o ponteiro de leitura
     * para o caracter que forma um token válido
     */
    private String voltaEntradaPosicao(Integer tamanhoVolta, String tokenValorAtual) {
        this.entradaPosicao = entradaPosicao - tamanhoVolta;

        return tokenValorAtual.substring(0, tokenValorAtual.length() - tamanhoVolta);
    }

    /**
     * Função que retorna a posição (Linha, Coluna)
     * de um token a partir da posição do ponteiro
     */
    private Posicao getPosicao() {
        Integer countAuxLinha = 0;
        Integer countAuxColuna = 0;
        Integer seekChars = this.entradaPosicao + 1;

        while (seekChars > 0) {
            Integer quantidadeColunasLinhaAtual = MapeandoColunas.get(countAuxLinha);

            if (seekChars > quantidadeColunasLinhaAtual) {
                countAuxLinha++;
                seekChars -= quantidadeColunasLinhaAtual;
            } else {
                countAuxColuna = seekChars;
                seekChars = 0;
            }
        }
        return new Posicao(countAuxLinha, countAuxColuna);
    }

    /**
     * Realiza iteração da string de entrada e
     * identifica e armazena os tokens na Lista de tokens
     */
    private void analisaEntrada() throws ErroLexicoException {
        List<Estado> estadosAnteriores = new LinkedList<Estado>();
        estadosAnteriores.add(estados.get(1));
        String tokenValorAtual = "";
        Estado estadoAnt = estados.get(1);

        while (nextChar()) {
            char charEntradaAtual = charsEntrada.get(entradaPosicao);

            NextEstado nextEstado = estadoAnt.nextEstado(charEntradaAtual);
            tokenValorAtual += charEntradaAtual;

            if (nextEstado.getErro()) {
                if (!estadosAnteriores.isEmpty()) {
                    EstadoAuxiliar estadoDoToken = verificaEstadoFinalList(estadosAnteriores);
                    if (estadoDoToken.getEstado() != null) {
                        String tokenValor = voltaEntradaPosicao(estadoDoToken.getPosicao(), tokenValorAtual);
                        Posicao posicaoToken = getPosicao();
                        Token token = new Token(posicaoToken, estadoDoToken.getEstado().getToken(), tokenValor.trim());

                        if (!token.getTipoToken().equals(TipoTokenEnum.COMENTARIO)) {
                            tokenList.add(token);
                        }

                        tokenValorAtual = new String();
                        estadoAnt = estados.get(1);
                        estadosAnteriores = new LinkedList<Estado>();
                        estadosAnteriores.add(estados.get(1));
                    } else {
                        Posicao posicaoToken = getPosicao();
                        throw new ErroLexicoException("Caractere não experado na posição " + posicaoToken.getLinha() + ":" + posicaoToken.getColuna());
                    }
                }
            } else {
                estadoAnt = estados.get(nextEstado.getEstadoNumero());
                estadosAnteriores.add(estadoAnt);
            }
        }
    }

    /**
     * Função responsável por verificar em uma lista de estados,
     * qual foi o último estado final e retorna-lo
     */
    private EstadoAuxiliar verificaEstadoFinalList(List<Estado> estadosAnteriores) {
        Estado estadoFinal = null;
        Integer index = 0;
        Integer contaPosicao = 0;

        for (Estado estado : estadosAnteriores) {
            if (estado.getEhTerminal()) {
                estadoFinal = estado;
                contaPosicao = index;
            }
            index++;
        }

        return new EstadoAuxiliar(estadoFinal, estadosAnteriores.size() - contaPosicao);
    }

    /**
     * Get da lista de tokens
     */
    public List<Token> getTokenList() {
        return tokenList;
    }

    /**
     * Instância os estados do automato do analisador
     */
    private void instanciaEstados() {
        estados.put(1, new Estado1(null, false));
        estados.put(2, new Estado2(TipoTokenEnum.IDENTIFICADOR, true));
        estados.put(3, new Estado3(TipoTokenEnum.NOME_TIPO, true));
        estados.put(4, new Estado4(TipoTokenEnum.INTEIRO, true));
        estados.put(5, new Estado5(TipoTokenEnum.SEPARADOR, true));
        estados.put(6, new Estado6(TipoTokenEnum.PONTO_FLUTUANTE, true));
        estados.put(7, new Estado7(null, false));
        estados.put(8, new Estado8(null, false));
        estados.put(9, new Estado9(TipoTokenEnum.CARCTERE_LITERAL, true));
        estados.put(10, new Estado10(null, false));
        estados.put(11, new Estado11(null, false));
        estados.put(12, new Estado12(TipoTokenEnum.IDENTIFICADOR, true));
        estados.put(13, new Estado13(TipoTokenEnum.IDENTIFICADOR, true));
        estados.put(14, new Estado14(TipoTokenEnum.IDENTIFICADOR, true));
        estados.put(15, new Estado15(TipoTokenEnum.IDENTIFICADOR, true));
        estados.put(16, new Estado16(TipoTokenEnum.IDENTIFICADOR, true));
        estados.put(17, new Estado17(TipoTokenEnum.IDENTIFICADOR, true));
        estados.put(18, new Estado18(TipoTokenEnum.IDENTIFICADOR, true));
        estados.put(19, new Estado19(TipoTokenEnum.IDENTIFICADOR, true));
        estados.put(20, new Estado20(TipoTokenEnum.IDENTIFICADOR, true));
        estados.put(21, new Estado21(TipoTokenEnum.LOGICO_LITERAL_TRUE, true));
        estados.put(22, new Estado22(TipoTokenEnum.IDENTIFICADOR, true));
        estados.put(23, new Estado23(TipoTokenEnum.NULO_LITERAL, true));
        estados.put(24, new Estado24(TipoTokenEnum.LOGICO_LITERAL_FALSE, true));
        estados.put(25, new Estado25(TipoTokenEnum.OPERADOR, true));
        estados.put(26, new Estado26(TipoTokenEnum.SEPARADOR, true));
        estados.put(27, new Estado27(TipoTokenEnum.OPERADOR, true));
        estados.put(28, new Estado28(TipoTokenEnum.OPERADOR, true));
        estados.put(29, new Estado29(TipoTokenEnum.OPERADOR, true));
        estados.put(30, new Estado30(TipoTokenEnum.OPERADOR, true));
        estados.put(31, new Estado31(null, false));
        estados.put(32, new Estado32(TipoTokenEnum.OPERADOR, true));
        estados.put(33, new Estado33(TipoTokenEnum.SEPARADOR, true));
        estados.put(34, new Estado34(null, false));
        estados.put(35, new Estado35(TipoTokenEnum.OPERADOR, true));
        estados.put(36, new Estado36(null, false));
        estados.put(37, new Estado37(TipoTokenEnum.COMENTARIO, true));
        estados.put(38, new Estado38(TipoTokenEnum.SEPARADOR, true));
        estados.put(39, new Estado39(TipoTokenEnum.SEPARADOR, true));
        estados.put(40, new Estado40(null, false));
        estados.put(41, new Estado41(TipoTokenEnum.COMENTARIO, true));
    }
}





