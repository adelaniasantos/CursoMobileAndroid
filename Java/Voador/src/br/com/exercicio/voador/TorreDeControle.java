package br.com.exercicio.voador;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {


    private List<Voador> listaVoadores = new ArrayList<>();

    public void addVoador(Voador voador){
        listaVoadores.add(voador);
    }

    public void voemTodos(){

        for (int i = 0; i < listaVoadores.size(); i++){
            listaVoadores.get(i).voar();
        }
    };


}
