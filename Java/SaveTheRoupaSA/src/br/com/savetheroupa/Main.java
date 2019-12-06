package br.com.savetheroupa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Peca> lilstaPecas = new ArrayList<>();
        List <Peca> lilstaPecas2 = new ArrayList<>();

        GuardaVolumes guardaVolumes = new GuardaVolumes();

        Peca peca1 = new Peca();
        Peca peca2 = new Peca();
        peca1.setMarca("Levis");
        peca1.setModelo("Calça Jeans");
        peca2.setMarca("Zara");
        peca2.setModelo("Blusa");
        lilstaPecas.add(peca1);
        lilstaPecas.add(peca2);

        Peca peca3 = new Peca();
        Peca peca4 = new Peca();
        peca3.setMarca("Nike");
        peca3.setModelo("Short");
        peca4.setMarca("Addidas");
        peca4.setModelo("Camiseta");
        lilstaPecas2.add(peca3);
        lilstaPecas2.add(peca4);

        guardaVolumes.guardarPecas(lilstaPecas);
        guardaVolumes.guardarPecas(lilstaPecas2);

        System.out.println("---> Mostra todas a Lista de pecas do guarda-volumes");
        guardaVolumes.mostrarPecas();

        System.out.println("");
        System.out.println("---> Mostra apenas a Lista de pecas solicitada.");
        guardaVolumes.mostrarPecas(1);

        System.out.println("");
        System.out.println("---> Mostra todas a Lista de pecas do guarda-volumes após retirada.");
        guardaVolumes.devolverPecas(1);
        guardaVolumes.mostrarPecas();

    }
}
