package MVVM;

import MVVM.model.Tarefa;
import MVVM.view.TelaTarefas;
import MVVM.viewmodel.TarefaViewModel;

public class Main {
    public static void main(String[] args) {
        TarefaViewModel viewModel = new TarefaViewModel();
        TelaTarefas view = new TelaTarefas();

        viewModel.adicionarTarefa(new Tarefa("Pagar contas", "Alta"));
        viewModel.adicionarTarefa(new Tarefa("Estudar Java", "Média"));
        viewModel.adicionarTarefa(new Tarefa("Arrumar a casa", "Baixa"));
        viewModel.adicionarTarefa(new Tarefa("Revisar código", "Alta"));
        viewModel.adicionarTarefa(new Tarefa("Comprar café", "Média"));

        view.mostrarTarefas(viewModel.getTarefasOrdenadas());
    }
}
