package br.com.digitalhouse;

import java.util.List;

public class Professor {
    private int registroDocente;
    private String nomeProfessor;

    public void darAulas(){
        System.out.println("Dando aula " + this.nomeProfessor);
    }

    public void chamadaDosAlunos(List<Aluno> listAlunos, int registroAluno){
        for (int i = 0; i < listAlunos.size(); i++) {
            if(listAlunos.get(i).getRegistroAcademico() == registroAluno){
                System.out.println("O aluno esta presente: " + listAlunos.get(i).getNome());
            }
        }
    }

}
