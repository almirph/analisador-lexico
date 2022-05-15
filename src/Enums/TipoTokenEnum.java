package Enums;

public enum TipoTokenEnum {
    IDENTIFICADOR(1, "IDENTIFICADOR"),
    NOME_TIPO(2, "NOME_TIPO"),
    INTEIRO(3, "INTEIRO"),
    PONTO_FLUTUANTE(4, "PONTO_FLUTUANTE"),
    CARCTERE_LITERAL(5, "CARCTERE_LITERAL"),
    LOGICO_LITERAL(6, "LOGICO_LITERAL"),
    NULO_LITERAL(7, "NULO_LITERAL"),
    OPERADOR(8, "OPERADOR"),
    SEPARADOR(9, "OPERADOR"),
    COMENTARIO(8, "OPERADOR"),
    ;
    private final int valor;
    private final String descricao;

    TipoTokenEnum(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
