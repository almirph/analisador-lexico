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
        if (charEntrada == 'a') {
            return new NextEstado(16, false, false);
        } else if ((charEntrada >= 'A' && charEntrada <= 'Z') || (charEntrada >= 'a' && charEntrada <= 'z') || (charEntrada >= '0' && charEntrada <= '9') || charEntrada == '_') {
            return new NextEstado(2, false, false);
        }
        return new NextEstado(null, false, true);
    }

}