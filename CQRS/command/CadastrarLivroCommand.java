package CQRS.command;

import java.util.List;

import CQRS.model.Livro;

public class CadastrarLivroCommand {
    private List<Livro> livros;

    public CadastrarLivroCommand(List<Livro> livros) {
        this.livros = livros;
    }

    public void cadastrar(String titulo, String autor) {
        livros.add(new Livro(titulo, autor));
    }
}
