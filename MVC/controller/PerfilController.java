package controller;

import model.Perfil;

public class PerfilController {
    public Perfil criarPerfil(String nome, int idade, String profissao) {
        return new Perfil(nome, idade, profissao);
    }
}
