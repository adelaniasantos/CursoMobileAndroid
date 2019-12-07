package br.com.aula10;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Pessoa joao = new Pessoa(18,"Joao Camargo", 0001);
        Pessoa jess = new Pessoa(18,"Jess", 0002);

        System.out.println("\n----------> Pessoa");
        if(joao.equals(jess)) {
            System.out.println("Objetos (Pessoa) iguais");
        }else{
            System.out.println("Objetos (Pessoa) diferentes");
        }
        System.out.println(joao.toString());

        System.out.println("\n----------> Coca");
        Coca coca1 = new Coca(300, 2.00);
        Coca coca2 = new Coca(300, 2.00);

        if(coca1.equals(coca2)) {
            System.out.println("Objetos (coca) iguais");
        }else{
            System.out.println("Objetos (coca) diferentes");
        }

        System.out.println("\n----------> Aluno");
        List<Aluno> alunos = new ArrayList<>();
        Aluno aluno1 = new Aluno("Adelania", 01);
        Aluno aluno2 = new Aluno("Paula", 02);
        Aluno aluno3 = new Aluno("Fernando", 03);
        Aluno aluno4 = new Aluno("Andreia",04);

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        Aluno alunoNovo = new Aluno("Rodrigo",02);

        if(alunos.contains(alunoNovo)){
            System.out.println("Contem o aluno");
        }else{
            System.out.println("Nao Contem o aluno");
        }

        System.out.println("\n----------> Funcionario");
        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario funcionario1 =  new Funcionario("Camila", 01);
        Funcionario funcionario2 =  new Funcionario("Paulo", 02);
        Funcionario funcionario3 =  new Funcionario("Felipe", 03);
        Funcionario funcionario4 =  new Funcionario("Mariana", 04);

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);

        Funcionario funcionarioNovo = new Funcionario("Maiara", 04);

        if(funcionarios.contains(funcionarioNovo)){
            System.out.println("Contem o Funcionario");
        }else {
            System.out.println("Nao Contem o Funcionario");
        }



    }
}
