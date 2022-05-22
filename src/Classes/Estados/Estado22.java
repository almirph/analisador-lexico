package Classes.Estados;

import Classes.NextEstado;
import Classes.Token;
import Enums.TipoTokenEnum;

public class Estado22 extends Estado {

    public Estado22(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if(charEntrada >= 'a' && charEntrada <= 'z' && charEntrada != 'e'){
            return new NextEstado(2,  false);
        }
        else if(charEntrada >= 'A' && charEntrada <= 'Z') {
            return new NextEstado(2, false);
        }
        else if(charEntrada >= '0' && charEntrada <= '9') {
            return new NextEstado(2,  false);
        }
        else if(charEntrada == '_') {
            return new NextEstado(2,  false);
        }
        else if(charEntrada == 'e'){
            return new NextEstado(25,  false);
        }

        return new NextEstado(null,  true);
    }

}