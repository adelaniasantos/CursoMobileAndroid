package br.com.revisao;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        IntegerSet integerSet = new IntegerSet();

        integerSet.getConjuntoClasse().add(10);
        integerSet.getConjuntoClasse().add(20);
        integerSet.getConjuntoClasse().add(30);

        List<Integer> listTeste = new ArrayList<>();
        listTeste.add(10);
        listTeste.add(20);
        listTeste.add(40);

        integerSet.converte(integerSet.diferenca(listTeste));
        integerSet.converte(integerSet.uniao(listTeste));
        integerSet.converte(integerSet.intersecao(listTeste));


    }
}
