package Classes;

import Classes.Estados.Estado;
import Classes.Estados.Estado1;
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

    private void analisaEntrada() {
        List<Character> charsEntrada = entrada.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        String tokenValorAtual = "";
        List<Estado> estadosAnteriores = new LinkedList<Estado>();

        while (nextChar()) {
            String tokenValorGuloso = "" + charsEntrada.get(entradaPosicao); //É o token anterior concatenado com o próximo token para teste guloso da entrada
            //Implementação do automato
        }
    }

    public List<Token> getTokenList() {
        return tokenList;
    }

    /**
     * Função de build que deve receber a entrada e gera  a lista de tokens
     **/
    public void buildAnalisador(String entrada) {
        this.entrada = entrada;
        entradaPosicao = 0;
        analisaEntrada();
    }

    private void instanciaEstados() {
        estados.put(1, new Estado1(null, false));
        estados.put(2, new Estado1(null, false));
    }
}





