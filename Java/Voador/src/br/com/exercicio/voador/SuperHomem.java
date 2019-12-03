package br.com.exercicio.voador;

public class SuperHomem implements Voador {

    private int experiencia;

    public SuperHomem(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void voar() {

        System.out.println("Estou voando como um campeão! Experiencia : " + (this.experiencia +=3));
    }
}
