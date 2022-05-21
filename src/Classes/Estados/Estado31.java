package Classes.Estados;

import Classes.NextEstado;
import Classes.Token;
import Enums.TipoTokenEnum;

public class Estado31 extends Estado {

    public Estado31(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        return null;
    }

}