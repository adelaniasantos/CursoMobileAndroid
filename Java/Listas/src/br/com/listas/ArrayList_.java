package br.com.listas;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Alberto");
        lista.add("Clementina");
        lista.add("Irineu");

        for (String valor : lista) {
            System.out.println(valor);
        }
    }
}
