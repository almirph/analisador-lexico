package Classes.Estados;

import Classes.NextEstado;
import Classes.Token;
import Enums.TipoTokenEnum;

public class Estado35 extends Estado {

    public Estado35(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if(charEntrada == '-') {
            return new NextEstado(36,  false);
        }

        return new NextEstado(null,  true);
    }

}