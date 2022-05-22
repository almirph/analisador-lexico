package Classes;

/**
 * Feito por Almir Philipe de Arruda matrícula 201635039
 * Vinícius de Castro Sampaio matrícula 201635002
 **/

public class Posicao {
    public Integer getLinha() {
        return linha;
    }

    public Integer getColuna() {
        return coluna;
    }

    private Integer linha;
    private Integer coluna;

    public Posicao(Integer linha, Integer coluna) {
        this.linha = linha + 1;
        this.coluna = coluna + 1;
    }
}
