package Classes.Estados;

import Classes.NextEstado;
import Interfaces.Estado;

import java.util.HashMap;

public class Estado2 implements Estado {
    private HashMap<Integer, Estado> todosEstadosList = new HashMap<Integer, Estado>();

    @Override
    public NextEstado nextEstado(char charEntrada) {
        return null;
    }

    @Override
    public void setTodosEstadosList(HashMap<Integer, Estado> todosEstadosList) {
        this.todosEstadosList = todosEstadosList;
    }
}
