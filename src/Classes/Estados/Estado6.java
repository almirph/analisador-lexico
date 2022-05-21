package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado6 extends Estado {

    public Estado6(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        return null;
    }

}