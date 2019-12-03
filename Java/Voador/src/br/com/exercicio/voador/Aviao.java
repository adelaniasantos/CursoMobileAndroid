package br.com.exercicio.voador;

public class Aviao implements Voador {

    private int horasDeVoo;

    public Aviao(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    @Override
    public void voar() {

        System.out.println("Estou voando como um avião! Horas de Voo : " + (this.horasDeVoo +=13));
    }
}
