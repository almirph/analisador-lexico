package Classes.Estados;

import Classes.NextEstado;
import Classes.Token;
import Enums.TipoTokenEnum;

public class Estado12 extends Estado {

    public Estado12(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if (charEntrada == 'u') {
            return new NextEstado(15,  false);
        } else if ((charEntrada >= 'A' && charEntrada <= 'Z') || (charEntrada >= 'a' && charEntrada <= 'z') || (charEntrada >= '0' && charEntrada <= '9') || charEntrada == '_') {
            return new NextEstado(2,  false);
        }
        return new NextEstado(null,  true);
    }

}