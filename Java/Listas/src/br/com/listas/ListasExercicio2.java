package br.com.listas;

import java.util.*;

public class ListasExercicio2 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Set<Integer> set_ = new HashSet<>();

        System.out.println("--------ArrayList");
        lista = listaVazia();
        for (Integer loteria : lista) {
            System.out.println(loteria);
        }

        System.out.println("--------HashSet");
        set_ = ListaVazia2();
        for (Integer valor : set_) {
            System.out.println(valor);
        }
    }

    public static List<Integer> listaVazia(){
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);

        return lista;
    }

    public static Set<Integer> ListaVazia2(){
        Set<Integer> conjuto = new HashSet<>();
        conjuto.add(1);
        conjuto.add(5);
        conjuto.add(5);
        conjuto.add(6);
        conjuto.add(7);
        conjuto.add(8);
        conjuto.add(8);
        conjuto.add(8);

        return conjuto;

    }
}
