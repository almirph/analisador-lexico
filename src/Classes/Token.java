package Classes;

import Enums.TipoTokenEnum;

/**
 * Feito por Almir Philipe de Arruda matrícula 201635039
 * Vinícius de Castro Sampaio matrícula 201635002
 **/
public class Token {
    private int linha;
    private int coluna;
    private TipoTokenEnum tipoToken;
    private String valor;

    public Token(int linha, int coluna, TipoTokenEnum tipoToken, String valor) {
        this.linha = linha;
        this.coluna = coluna;
        this.tipoToken = tipoToken;
        this.valor = valor;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public TipoTokenEnum getTipoToken() {
        return tipoToken;
    }

    public void setTipoToken(TipoTokenEnum tipoToken) {
        this.tipoToken = tipoToken;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
