package Classes;

import Classes.Estados.*;
import Enums.TipoTokenEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Analisador {
    private List<Token> tokenList = new ArrayList<>();
    private HashMap<Integer, Estado> estados = new HashMap<Integer, Estado>();

    private String entrada;

    private int entradaPosicao;

    private boolean nextChar() {
        if (entradaPosicao < entrada.length()) {
            entradaPosicao++;
            return true;
        } else {
            return false;
        }
    }

    private String voltaEntradaPosicao(Integer tamanhoVolta, String tokenValorAtual) {
        this.entradaPosicao = entradaPosicao - tamanhoVolta;

        return tokenValorAtual.substring(0, tokenValorAtual.length() - tamanhoVolta);
    }

    private void analisaEntrada() throws Exception {
        List<Character> charsEntrada = entrada.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Estado> estadosAnteriores = new LinkedList<Estado>();
        String tokenValorAtual = "";
        Estado estadoAnt = estados.get(1);

        while (nextChar()) {
            char charEntradaAtual = charsEntrada.get(entradaPosicao);
            NextEstado nextEstado = estadoAnt.nextEstado(charEntradaAtual);

            if (nextEstado.getErro()) {
                if (!estadosAnteriores.isEmpty()) {
                    EstadoAuxiliar estadoDoToken = verificaEstadoFinalList(estadosAnteriores);
                    if (estadoDoToken.getEstado() != null) {
                        tokenList.add(new Token(0, 0, estadoDoToken.getEstado().getToken(), tokenValorAtual));
                        String tokenValor = voltaEntradaPosicao(estadoDoToken.getPosicao(), tokenValorAtual);
                        System.out.println(tokenValor);

                        tokenValorAtual = "";
                        estadoAnt = estados.get(1);
                    } else {
                        throw new Exception("Erro Léxico");
                    }
                }
            }
            else {
                estadosAnteriores.add(estadoAnt);
                tokenValorAtual += charEntradaAtual;
                estadoAnt = estados.get(nextEstado.getEstadoNumero());
            }
        }
    }

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

    public List<Token> getTokenList() {
        return tokenList;
    }

    /**
     * Função de build que deve receber a entrada e gera  a lista de tokens
     **/
    public void buildAnalisador(String entrada) throws Exception {
        this.instanciaEstados();
        this.entrada = entrada;
        entradaPosicao = -1;
        analisaEntrada();
    }

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
        estados.put(37, new Estado37(TipoTokenEnum.COMENTARIO_FINAL, true));
        estados.put(38, new Estado38(null, false));
        estados.put(39, new Estado39(TipoTokenEnum.SEPARADOR, true));
        estados.put(40, new Estado40(null, false));
        estados.put(41, new Estado41(TipoTokenEnum.COMENTARIO_FINAL, true));
    }
}





