package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado3 extends Estado {

    public Estado3(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if((charEntrada >= 'a' && charEntrada <= 'z') || (charEntrada >= 'A' && charEntrada <= 'Z') || (charEntrada >= '0' && charEntrada <= '9') || charEntrada == '_') {
            return new NextEstado(3, false, false);
        }
        return new NextEstado(null, false, true);
    }

}