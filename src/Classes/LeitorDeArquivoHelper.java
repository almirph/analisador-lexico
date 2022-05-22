package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Feito por Almir Philipe de Arruda matrícula 201635039
 * Vinícius de Castro Sampaio matrícula 201635002
 **/

public class LeitorDeArquivoHelper {
    private static String lerDeInputStream(InputStream inputStream) throws IOException {
        StringBuilder resultadoStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                resultadoStringBuilder.append(linha).append("\n");
            }
        }
        return resultadoStringBuilder.toString();
    }

    public static String lerFileData(String filePath) throws IOException {
        ClassLoader classLoader = LeitorDeArquivoHelper.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("Inputs/".concat(filePath));
        return lerDeInputStream(inputStream);
    }
}
