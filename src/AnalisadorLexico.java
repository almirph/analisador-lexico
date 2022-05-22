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

        String entrada = LeitorDeArquivoHelper.lerFileData("sintaxe/certo/attrCHAR.lan");

        Analisador analisador = new Analisador();
        analisador.buildAnalisador(entrada);
    }

}