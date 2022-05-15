import Classes.Token;
import Enums.TipoTokenEnum;

/**
 * Main class Analisador Lexico
 **/
public class AnalisadorLexico {
    public static void main(String[] args) {
        Token token = new Token(10, 10, TipoTokenEnum.IDENTIFICADOR, "a");
        System.out.println(token.getLinha());
        System.out.println(token.getColuna());
        System.out.println(token.getTipoToken().getDescricao());
        System.out.println(token.getValor());
    }
}