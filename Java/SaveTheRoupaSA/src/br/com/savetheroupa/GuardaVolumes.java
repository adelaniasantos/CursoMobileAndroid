package br.com.savetheroupa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {

    private List<Peca>  listaDePecas = new ArrayList<>();
    private Map<Integer, List<Peca>> dicionario = new HashMap<>();
    private int contador = 1;

    public Integer guardarPecas(List<Peca> listaDePecas){

        int id = getProximoID();
        dicionario.put(id, listaDePecas);

        return id;
    }

    public void mostrarPecas(){
         //mprime todas as peças que estão no guarda-volumes,junto com o número correspondente
         for (Integer chave : dicionario.keySet()){
            listaDePecas = dicionario.get(chave);
            for (Peca listaDePeca : listaDePecas) {
                System.out.println("Chave: " + chave + " - Marca: " + listaDePeca.getMarca() + " - Modelo: " + listaDePeca.getModelo());
            }

        }
    }

    public void mostrarPecas(Integer numero){
        //imprima as peças que estão associadas ao número recebido
        listaDePecas = dicionario.get(numero);
        for (Peca listaDePeca : listaDePecas) {
            System.out.println("Chave: " + numero + " - Marca: " + listaDePeca.getMarca() + " - Modelo: " + listaDePeca.getModelo());
        }
    }

    public void devolverPecas(Integer numero){
        //remova a lista de peças que esta associada ao número recebido"
        dicionario.remove(numero);
        System.out.println("As Peças do ID " + numero + " foram removidas com sucesso.");
    }

    public int getProximoID() {
        return this.contador++;
    }


}
