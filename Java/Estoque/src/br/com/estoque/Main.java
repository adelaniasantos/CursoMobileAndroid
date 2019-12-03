package br.com.estoque;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Impressora", 30, 2);
        System.out.println(estoque.mostra());

        estoque.mudarNome("Impressora HP");
        estoque.darBaixa(30);
        estoque.mudarQtdMinima(5);

        if(estoque.precisaRepor()){
            System.out.println("Quantidade atual menor que quantidade Minina, precisa repor.");
            estoque.repor(estoque.getQtdMinima()+10);
        }

        System.out.println(estoque.mostra());


    }
}
