package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado4 extends Estado {

    public Estado4(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        return null;
    }

}