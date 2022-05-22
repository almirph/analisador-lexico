package Classes;

import Enums.TipoTokenEnum;

/**
 * Feito por Almir Philipe de Arruda matrícula 201635039
 * Vinícius de Castro Sampaio matrícula 201635002
 **/
public class Token {
    private Posicao posicao;
    private TipoTokenEnum tipoToken;
    private String valor;

    public Token(Posicao posicao, TipoTokenEnum tipoToken, String valor) {
        this.posicao = posicao;
        this.tipoToken = tipoToken;
        this.valor = valor;
    }

    public int getLinha() {
        return posicao.getLinha();
    }

    public int getColuna() {
        return posicao.getColuna();
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
