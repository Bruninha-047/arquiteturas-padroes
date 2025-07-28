package CQRS;

import java.util.ArrayList;
import java.util.List;

import CQRS.command.CadastrarLivroCommand;
import CQRS.model.Livro;
import CQRS.query.ConsultarLivrosQuery;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        CadastrarLivroCommand command = new CadastrarLivroCommand(livros);
        ConsultarLivrosQuery query = new ConsultarLivrosQuery(livros);

        command.cadastrar("Antes de voçe", "Collen Hoover");
        command.cadastrar("Dom Casmurro", "Machado de Assis");
        command.cadastrar("You", "Collen Hoover");

        query.exibirLivros();
    }
}
