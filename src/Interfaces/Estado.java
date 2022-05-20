package Interfaces;

import Classes.NextEstado;

import java.util.HashMap;

public interface Estado {
    /**
     * Essa função deve verificar qual o proximo estado a partir do próximo char, se não tiver próximo estado ela seta finalizou para true e se tiver dado erro seta erro para true, se o estado for o atual retorna this no NextEstado.Estado
     **/
    NextEstado nextEstado(char charEntrada);
    void setTodosEstadosList(HashMap<Integer, Estado> todosEstadosList);


}
