package Classes.Estados;

import Classes.NextEstado;
import Classes.Token;
import Enums.TipoTokenEnum;

public class Estado10 extends Estado {

    public Estado10(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if(charEntrada == 'n' || charEntrada == 't' || charEntrada == 'b' || charEntrada == 'r' || charEntrada == '\\') {
            return new NextEstado(11,  false);
        }
        else if (charEntrada == '\'') {
            return new NextEstado(9,  false);
        }
        return new NextEstado(null,  true);
    }

}