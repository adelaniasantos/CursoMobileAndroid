package br.com.listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListasExercicio1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Map<String, String> mapa = new HashMap<>();

        System.out.println("--------ArrayList");
        lista = loteriaDosSonhos();
        for (String loteria : lista) {
            System.out.println(loteria);
        }

        System.out.println("--------HashMap");
        mapa = dicionarioApelidos();
        for (String chave : mapa.keySet()){
            String valor = mapa.get(chave);
            System.out.println("Chave: " + chave + " - Valor: " + valor);
        }
    }

    public static List<String> loteriaDosSonhos(){
        List<String> lista = new ArrayList<>();

        lista.add("Ovos");
        lista.add("Agua");
        lista.add("Escopeta");
        lista.add("Cavalo");
        lista.add("Dentista");
        lista.add("Fogo");

        return  lista;
    }

    public static Map<String, String> dicionarioApelidos(){
        Map<String, String> mapa = new HashMap<>();

        mapa.put("Joao","Juan, Fissura, Maromba");
        mapa.put("Miguel","Night Watch, Bruce Wayne, Tampinha");
        mapa.put("Maria","Wonder Woman, Mary, Marilene");
        mapa.put("Lucas","Lukinha, Jorge, George");

        return mapa;
    }

}
