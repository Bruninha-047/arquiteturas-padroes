package view;

import model.Perfil;

public class TelaPerfil {
    public void exibirPerfil(Perfil perfil) {
        System.out.println("Perfil do Usuário");
        System.out.println("Nome: " + perfil.getNome());
        System.out.println("Idade: " + perfil.getIdade());
        System.out.println("Profissão: " + perfil.getProfissao());
    }
}
