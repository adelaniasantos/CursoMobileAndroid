package br.com.exercicio.voador;

public class Principal {

    public static void main(String[] args) {

        Pato pato = new Pato(5);
        Aviao aviao = new Aviao(10);
        SuperHomem superHomem = new SuperHomem(100);

        TorreDeControle torreDeControle = new TorreDeControle();

        torreDeControle.addVoador(pato);
        torreDeControle.addVoador(aviao);
        torreDeControle.addVoador(superHomem);

        torreDeControle.voemTodos();

    }
}
