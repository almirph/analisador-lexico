package Classes;

/**
 * Feito por Almir Philipe de Arruda matrícula 201635039
 * Vinícius de Castro Sampaio matrícula 201635002
 **/
public class NextEstado {
    private Integer estadoNumero;
    private Boolean finalizou;
    private Boolean erro;

    public NextEstado(Integer estadoNumero, Boolean finalizou, Boolean erro) {
        this.estadoNumero = estadoNumero;
        this.finalizou = finalizou;
        this.erro = erro;
    }

    public Integer getEstadoNumero() {
        return estadoNumero;
    }

    public void setEstadoNumero(Integer estadoNumero) {
        this.estadoNumero = estadoNumero;
    }

    public Boolean getFinalizou() {
        return finalizou;
    }

    public void setFinalizou(Boolean finalizou) {
        this.finalizou = finalizou;
    }

    public Boolean getErro() {
        return erro;
    }

    public void setErro(Boolean erro) {
        this.erro = erro;
    }
}
