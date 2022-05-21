package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado40 extends Estado {

    public Estado40(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if(charEntrada == '}') {
            return new NextEstado(41, false, false);
        }

        return new NextEstado(34, false, false);
    }

}