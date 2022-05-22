package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado5 extends Estado {

    public Estado5(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if(charEntrada >= '0' && charEntrada <= '9') {
            return new NextEstado(6,  false);
        }

        return new NextEstado(null,  true);
    }

}