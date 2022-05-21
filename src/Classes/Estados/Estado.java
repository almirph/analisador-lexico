package Classes.Estados;

import Classes.NextEstado;
import Classes.Token;
import Enums.TipoTokenEnum;

import java.util.HashMap;

public class Estado {
    private TipoTokenEnum tipoTokenEnum;
    private Boolean ehTerminal;

    public Estado(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        this.tipoTokenEnum = tipoTokenEnum;
        this.ehTerminal = ehTerminal;
    }

    /**
     * Essa função deve verificar qual o proximo estado a partir do próximo char, se não tiver próximo estado ela seta finalizou para true e se tiver dado erro seta erro para true, se o estado for o atual retorna this no NextEstado.Estado
     **/
    public NextEstado nextEstado(char charEntrada) {
        return null;
    }

    public TipoTokenEnum getToken() {
        return tipoTokenEnum;
    }

    public void setToken(TipoTokenEnum tipoTokenEnum) {
        this.tipoTokenEnum = tipoTokenEnum;
    }

    public Boolean getEhTerminal() {
        return ehTerminal;
    }

    public void setEhTerminal(Boolean ehTerminal) {
        this.ehTerminal = ehTerminal;
    }
}
