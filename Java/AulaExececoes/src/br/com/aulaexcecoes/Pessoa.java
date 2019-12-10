package br.com.aulaexcecoes;

public class Pessoa {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarNome() throws Exception{
        System.out.println(getNome());
    }
}
