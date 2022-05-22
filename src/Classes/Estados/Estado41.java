package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado41 extends Estado {

    public Estado41(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        return new NextEstado(null, true);
    }

}