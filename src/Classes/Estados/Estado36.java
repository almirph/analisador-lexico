package Classes.Estados;

import Classes.NextEstado;
import Classes.Token;
import Enums.TipoTokenEnum;

public class Estado36 extends Estado {

    public Estado36(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if(charEntrada == '\n' || charEntrada == '\r') {
            return new NextEstado(37, false);
        }

        return new NextEstado(36, false);
    }

}