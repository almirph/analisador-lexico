package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado2 extends Estado {

    public Estado2(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        return null;
    }

}