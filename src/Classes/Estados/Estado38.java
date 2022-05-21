package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado38 extends Estado {

    public Estado38(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {

        if(charEntrada == ':')
            return new NextEstado(39, false, false);
        return new NextEstado(0, true, true);

    }

}