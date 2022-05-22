package Classes.Estados;

import Classes.NextEstado;
import Enums.TipoTokenEnum;

public class Estado1 extends Estado {

    public Estado1(TipoTokenEnum tipoTokenEnum, Boolean ehTerminal) {
        super(tipoTokenEnum, ehTerminal);
    }

    @Override
    public NextEstado nextEstado(char charEntrada) {
        if ( charEntrada == ' ' || charEntrada == '\n' || charEntrada == '\b' || charEntrada == '\t' || charEntrada == '\r') {
            return new NextEstado(12, false, false);
        }
        if ( charEntrada == 'n') {
            return new NextEstado(12, false, false);
        }
        else if ( charEntrada == 't') {
            return new NextEstado(14, false, false);
        }
        else if ( charEntrada == 'f') {
            return new NextEstado(13, false, false);
        }
        else if ( charEntrada >= 'a' && charEntrada <= 'z') {
            return new NextEstado(2, false, false);
        }
        else if ( charEntrada >= 'A' && charEntrada <= 'Z') {
            return new NextEstado(3, false, false);
        }
        else if ( charEntrada == '.') {
            return new NextEstado(5, false, false);
        }
        else if ( charEntrada >= '0' && charEntrada <= '9') {
            return new NextEstado(4, false, false);
        }
        else if ( charEntrada == '=') {
            return new NextEstado(27, false, false);
        }
        else if ( charEntrada == '(' || charEntrada == ')' || charEntrada == '[' || charEntrada == ']' || charEntrada == ';' || charEntrada == ',' || charEntrada == '}') {
            return new NextEstado(26, false, false);
        }
        else if ( charEntrada == '<' || charEntrada == '>' || charEntrada == '+' || charEntrada == '*' || charEntrada == '/' || charEntrada == '%') {
            return new NextEstado(25, false, false);
        }
        else if ( charEntrada == '\'') {
            return new NextEstado(7, false, false);
        }
        else if ( charEntrada == '{') {
            return new NextEstado(26, false, false);
        }

        return new NextEstado(null, false, true);
    }

}