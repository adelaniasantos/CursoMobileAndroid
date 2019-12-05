package br.com.listas;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {

    public static void main(String[] args) {
        Prova prova = new Prova();

        Set<Integer> conjuto = new HashSet<>();

        conjuto.add(1);
        conjuto.add(5);
        conjuto.add(15);
        conjuto.add(6);
        conjuto.add(7);
        conjuto.add(18);
        conjuto.add(28);
        conjuto.add(38);

        prova.somaTotal(conjuto);

        for (Integer valor : conjuto) {
            System.out.println(valor);
        }

    }
}
