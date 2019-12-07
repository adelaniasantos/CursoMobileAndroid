package br.com.aula10;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private int numeroDeRegistro;

    public Funcionario(String nome, int numeroDeRegistro) {
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return numeroDeRegistro == that.numeroDeRegistro;
    }

    @Override
    public int hashCode() {

        return Objects.hash(numeroDeRegistro);
    }
}
