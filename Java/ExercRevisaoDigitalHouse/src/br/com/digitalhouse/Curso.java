package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private Professor profResponsavel;
    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Aula> conjuntoAulas;

    public void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Professor getProfResponsavel() {
        return profResponsavel;
    }

    public void setProfResponsavel(Professor profResponsavel) {
        this.profResponsavel = profResponsavel;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Aula> getConjuntoAulas() {
        return conjuntoAulas;
    }

    public void setConjuntoAulas(List<Aula> conjuntoAulas) {
        this.conjuntoAulas = conjuntoAulas;
    }
}
