package MVP;

import MVP.model.Pessoa;
import MVP.presenter.ImcPresenter;
import MVP.view.TelaIMC;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(68, 1.65);
        ImcPresenter presenter = new ImcPresenter();
        TelaIMC view = new TelaIMC();

        String resultado = presenter.calcularIMC(pessoa);
        view.mostrarResultado(resultado);
    }
}
