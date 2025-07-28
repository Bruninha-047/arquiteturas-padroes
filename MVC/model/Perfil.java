package model;

public class Perfil {
    private String nome;
    private int idade;
    private String profissao;

    public Perfil(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getProfissao() { return profissao; }
}
