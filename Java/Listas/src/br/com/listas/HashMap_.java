package br.com.listas;

import java.util.HashMap;
import java.util.Map;

public class HashMap_ {
    public static void main(String[] args) {
        Map <Integer, String> mapa = new HashMap();

        mapa.put(4,"Fizemos 4 gols contra você");
        mapa.put(1,"Fizemos 1 gols contra você");
        mapa.put(2,"Fizemos 2 gols contra você");
        mapa.put(2,"Fizemos 5 gols contra você");//Sobrepoe o valor da chave 2

        //mapa.remove(4);
        //System.out.println(mapa.get(2));

        for (Integer chave : mapa.keySet()){
            String valor = mapa.get(chave);
            System.out.println(valor);
        }
    }
}
