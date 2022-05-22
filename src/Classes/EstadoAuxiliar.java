package Classes;

import Classes.Estados.Estado;

/**
 * Feito por Almir Philipe de Arruda matrícula 201635039
 * Vinícius de Castro Sampaio matrícula 201635002
 **/

public class EstadoAuxiliar {
    private Estado estado;
    private Integer posicao;

    public EstadoAuxiliar(Estado estado, Integer posicao) {
        this.estado = estado;
        this.posicao = posicao;
    }

    public Estado getEstado() {
        return estado;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
