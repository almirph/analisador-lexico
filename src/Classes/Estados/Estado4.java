package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado4 extends Estado {

    public Estado4(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if(charEntrada >= '0' && charEntrada <= '9') {
            return new NextEstado(4, false, false);
        }
        else if(charEntrada == '.') {
            return new NextEstado(6, false, false);
        }
        return new NextEstado(null, false, true);
    }

}