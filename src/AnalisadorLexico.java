import Classes.Analisador;
import Classes.LeitorDeArquivoHelper;
import Classes.Token;
import Enums.TipoTokenEnum;

import java.io.*;

/**
 * Main class Analisador Lexico
 **/
public class AnalisadorLexico {
    public static void main(String[] args) throws Exception {
        Token token = new Token(10, 10, TipoTokenEnum.IDENTIFICADOR, "a");
        System.out.println(token.getLinha());
        System.out.println(token.getColuna());
        System.out.println(token.getTipoToken().getDescricao());
        System.out.println(token.getValor());

        String entrada = LeitorDeArquivoHelper.lerFileData("sintaxe/certo/attrCHAR.lan");

        Analisador analisador = new Analisador();
        analisador.buildAnalisador(entrada);
    }

}