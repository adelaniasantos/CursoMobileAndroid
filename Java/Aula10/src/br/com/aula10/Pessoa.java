package br.com.aula10;

import java.util.Objects;

public class Pessoa {

    private int idade;
    private String nome;
    private int rg;
    private String sobrenome;

    public Pessoa(int idade, String nome, int rg) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade &&
                rg == pessoa.rg &&
                Objects.equals(nome, pessoa.nome);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", rg=" + rg +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
