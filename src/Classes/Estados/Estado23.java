package Classes.Estados;

import Classes.NextEstado;
import Classes.Token;
import Enums.TipoTokenEnum;

public class Estado23 extends Estado {

    public Estado23(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        return null;
    }

}