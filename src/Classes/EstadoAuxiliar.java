package Classes;

import Classes.Estados.Estado;

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

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }
}
