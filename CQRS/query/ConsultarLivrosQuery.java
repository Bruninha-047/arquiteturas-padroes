package CQRS.query;

import java.util.List;

import CQRS.model.Livro;

public class ConsultarLivrosQuery {
    private List<Livro> livros;

    public ConsultarLivrosQuery(List<Livro> livros) {
        this.livros = livros;
    }

    public void exibirLivros() {
        System.out.println("Livros Cadastrados");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }
    }
}
