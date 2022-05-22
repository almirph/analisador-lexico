package Enums;

/**
 * Feito por Almir Philipe de Arruda matrícula 201635039
 * Vinícius de Castro Sampaio matrícula 201635002
 **/
public enum TipoTokenEnum {
    IDENTIFICADOR(1, "IDENTIFICADOR"),
    NOME_TIPO(2, "NOME_TIPO"),
    INTEIRO(3, "INTEIRO"),
    PONTO_FLUTUANTE(4, "PONTO_FLUTUANTE"),
    CARCTERE_LITERAL(5, "CARCTERE_LITERAL"),
    LOGICO_LITERAL_TRUE(6, "LOGICO_LITERAL_TRUE"),
    NULO_LITERAL(7, "NULO_LITERAL"),
    OPERADOR(8, "OPERADOR"),
    SEPARADOR(9, "SEPARADOR"),
    LOGICO_LITERAL_FALSE(10, "LOGICO_LITERAL_FALSE"),
    COMENTARIO(11, "COMENTARIO"),

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
