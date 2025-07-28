package MVVM.view;

import java.util.List;

import MVVM.model.Tarefa;

public class TelaTarefas {
    public void mostrarTarefas(List<Tarefa> tarefas) {
        System.out.println("Lista de Tarefas");
        for (Tarefa t : tarefas) {
            System.out.println("[" + t.getPrioridade() + "] " + t.getTitulo());
        }
    }
}
