package Classes;

public class NextEstado {
    private Integer estadoNumero;
    private Boolean finalizou;
    private Boolean erro;

    public NextEstado(Integer estadoNumero, Boolean finalizou, Boolean erro) {
        this.estadoNumero = estadoNumero;
        this.finalizou = finalizou;
        this.erro = erro;
    }
}
