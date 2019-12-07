package br.com.aula10;

import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer numeroDoAluno;

    public Aluno(String nome, Integer numeroDoAluno) {
        this.nome = nome;
        this.numeroDoAluno = numeroDoAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(numeroDoAluno, aluno.numeroDoAluno);
    }

}
