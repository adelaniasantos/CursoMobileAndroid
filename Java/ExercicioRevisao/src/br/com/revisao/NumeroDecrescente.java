package br.com.revisao;

import java.util.Scanner;

public class NumeroDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro posititvo maior que zero: ");
        int numero = scanner.nextInt();

        numeroDecrescente(numero);
    }

    public static void numeroDecrescente(int numero){

        for (int i = numero; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
