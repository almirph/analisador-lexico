package Enums;

public enum TipoTokenEnum {
    IDENTIFICADOR(1, "IDENTIFICADOR"), INTEIRO(2, "INTEIRO");
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
