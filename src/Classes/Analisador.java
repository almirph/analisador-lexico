package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Analisador {
    private List<Token> tokenList = new ArrayList<>();
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
}
