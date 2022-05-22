package Classes.Estados;

import Classes.NextEstado;
import Classes.Token;
import Enums.TipoTokenEnum;

public class Estado7 extends Estado {

    public Estado7(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if(charEntrada != '\\') {
            return new NextEstado(8,  false);
        }
        else if (charEntrada == '\\') {
            return new NextEstado(10, false);
        }
        return new NextEstado(null,  true);
    }

}