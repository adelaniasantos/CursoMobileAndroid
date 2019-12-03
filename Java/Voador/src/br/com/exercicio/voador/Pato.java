package br.com.exercicio.voador;

public class Pato implements Voador {

    public Pato(int energia) {
        this.energia = energia;
    }

    public int energia;

    @Override
    public void voar() {

        System.out.println("Estou voando como um pato! Energia: " + (this.energia -= 5));

    }
}
