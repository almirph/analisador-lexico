package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado2 extends Estado {

    public Estado2(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if(charEntrada >= 'a' && charEntrada <= 'z' || charEntrada >= 'A' || charEntrada <= 'Z' || charEntrada >= '0' || charEntrada <= '9' || charEntrada == '_') {
            return new NextEstado(2, false, false);
        }
        return new NextEstado(null, false, true);
    }

}