package MVVM.viewmodel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import MVVM.model.Tarefa;

public class TarefaViewModel {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> getTarefasOrdenadas() {
        Collections.sort(tarefas);
        return tarefas;
    }
}
