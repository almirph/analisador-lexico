package Classes;

/**
 * Feito por Almir Philipe de Arruda matrícula 201635039
 * Vinícius de Castro Sampaio matrícula 201635002
 **/
public class NextEstado {
    private Integer estadoNumero;
    private Boolean erro;

    public NextEstado(Integer estadoNumero, Boolean erro) {
        this.estadoNumero = estadoNumero;
        this.erro = erro;
    }

    public Integer getEstadoNumero() {
        return estadoNumero;
    }

    public Boolean getErro() {
        return erro;
    }
}
