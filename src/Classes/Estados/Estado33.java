package Classes.Estados;

import Classes.NextEstado;
import Classes.Token;
import Enums.TipoTokenEnum;

public class Estado33 extends Estado {

    public Estado33(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        return null;
    }

}