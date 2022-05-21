package Classes.Estados;

import Classes.NextEstado;
import Classes.Token;
import Enums.TipoTokenEnum;

public class Estado13 extends Estado {

    public Estado13(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        return null;
    }

}