package br.com.listas;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        Set<String> conjuto = new HashSet<>();

        conjuto.add("Fácil");
        conjuto.add("Difícil");
        conjuto.add("Normal");

        //conjuto.remove("Normal");

        for (String valor : conjuto) {
            System.out.println(valor);
        }
    }
}
