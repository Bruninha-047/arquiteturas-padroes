package MVP.presenter;

import MVP.model.Pessoa;

public class ImcPresenter {
    public String calcularIMC(Pessoa pessoa) {
        double imc = pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());

        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Peso normal";
        else if (imc < 30) return "Sobrepeso";
        else return "Obesidade";
    }
}
