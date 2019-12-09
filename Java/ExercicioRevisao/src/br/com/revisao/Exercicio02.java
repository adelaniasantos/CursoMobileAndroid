package br.com.revisao;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {
    public static void main(String[] args) {
        List<Pessoa> pessoaList = new ArrayList<>();
        pessoaList.add(new Pessoa("Adelania", 33));
        pessoaList.add(new Pessoa("Rodrigo", 31));
        pessoaList.add(new Pessoa("Anne", 32));

        comparaIdade(pessoaList);

    }

    public static void comparaIdade(List<Pessoa> pessoaList){
        String nomeMaisVelho = null;
        String nomeMaisNovo = null;
        int maiorIdade = 0 ;
        int menorIdade = 0;

        for (Pessoa pessoa : pessoaList) {
            if(pessoa.getIdade() > maiorIdade){
                maiorIdade = pessoa.getIdade();
                nomeMaisVelho = pessoa.getNome();
            }
        }

        menorIdade = maiorIdade;
        for (Pessoa pessoa : pessoaList) {
            if(pessoa.getIdade() < menorIdade){
                menorIdade = pessoa.getIdade();
                nomeMaisNovo = pessoa.getNome();
            }
        }

        System.out.println("O nome da pessoa mais nova é : " + nomeMaisNovo);
        System.out.println("O nome da pessoa mais velha é : " + nomeMaisVelho);
    }
}
