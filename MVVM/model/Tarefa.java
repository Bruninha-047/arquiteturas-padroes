package MVVM.model;

public class Tarefa implements Comparable<Tarefa> {
    private String titulo;
    private String prioridade;

    public Tarefa(String titulo, String prioridade) {
        this.titulo = titulo;
        this.prioridade = prioridade;
    }

    public String getTitulo() { return titulo; }
    public String getPrioridade() { return prioridade; }

    @Override
    public int compareTo(Tarefa outra) {
        return getPesoPrioridade(outra.prioridade) - getPesoPrioridade(this.prioridade);
    }

    private int getPesoPrioridade(String p) {
        switch (p.toLowerCase()) {
            case "alta":
                return 3;
            case "média":
                return 2;
            default:
                return 1;
        }
        
    }
}
