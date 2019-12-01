package br.com.ingresso;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para o Ingresso Normal e 2 para Ingresso VIP.");
        int tipoIngresso = scanner.nextInt();

        if(tipoIngresso == 1){
            Normal normal = new Normal(50);
            normal.imprimeValor();
        }else{
            System.out.println("Digite 1 para Camarote Superior e 2 para Camarote Inferior:");
            int tipoCamarote = scanner.nextInt();

            if (tipoCamarote == 1 ){
                CamaroteSuperior camaroteSuperior = new CamaroteSuperior(50,10, "Camarote Superior", 10);
                camaroteSuperior.imprimeLocalizacao();
                camaroteSuperior.imprimeValor();
            }else {
                CamaroteInferior camaroteInferior = new CamaroteInferior(50, 10, "Camarote Inferior");
                camaroteInferior.imprimeLocalizacao();
                camaroteInferior.imprimeValor();

            }

        }




    }
}
