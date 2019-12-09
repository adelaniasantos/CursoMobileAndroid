package br.com.revisao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        getMostrarNumero(numero);



    }

    private static void getMostrarNumero(int numero) {

        System.out.println("Numero informado: " + numero + " - Antercesso: " + (numero-1)  + " - Cucessor: " + (numero+1));
    }


}
