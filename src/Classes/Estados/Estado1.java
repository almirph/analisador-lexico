package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado1 extends Estado {

    public Estado1(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {

        return super.nextEstado(charEntrada);
    }

}