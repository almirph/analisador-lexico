import Classes.Analisador;
import Classes.LeitorDeArquivoHelper;

/**
 * Main class Analisador Lexico
 **/
public class AnalisadorLexico {
    public static void main(String[] args) throws Exception {

        String entrada = LeitorDeArquivoHelper.lerFileData("semantica/certo/teste8.lan");

        Analisador analisador = new Analisador();
        analisador.buildAnalisador(entrada);
        analisador.getTokenList().forEach((token -> System.out.println(token.getTipoToken().getDescricao() + " : " +  token.getValor() + " : " + token.getLinha() + " : " + token.getColuna())));

    }

}