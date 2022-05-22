import Classes.LeitorDeArquivoHelper;

/**
 * Main class Analisador Lexico
 *
 * Feito por Almir Philipe de Arruda matrícula 201635039
 * Vinícius de Castro Sampaio matrícula 201635002
 **/

public class AnalisadorLexico {
    public static void main(String[] args) throws Exception {

        String entrada = LeitorDeArquivoHelper.lerFileData("semantica/errado/attrAND.lan");

        Classes.AnalisadorLexico analisador = new Classes.AnalisadorLexico();
        analisador.buildAnalisador(entrada);
        analisador.getTokenList().forEach((token -> System.out.println(token.getTipoToken().getDescricao() + " : " +  token.getValor() + " : " + token.getLinha() + " : " + token.getColuna())));

    }

}