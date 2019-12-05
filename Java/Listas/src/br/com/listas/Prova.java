package br.com.listas;

import java.util.Set;
import java.util.*;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros){

        int soma = 0;
        for (Integer valor : conjuntoDeInteiros) {
            soma +=valor;
        }

        System.out.println("O soma dos valores e: " + soma);
    }
}
