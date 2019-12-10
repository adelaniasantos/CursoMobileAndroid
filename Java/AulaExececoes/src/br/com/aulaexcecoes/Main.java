package br.com.aulaexcecoes;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Main {

    public static void main(String[] args) {
        try {

            ArrayList<String> lista = new ArrayList<>();
            lista.add("Joao");
            lista.add("Jessica");
            lista.add("Tarantino");

            System.out.println(lista.get(3));

            Date data = new SimpleDateFormat("dd/MM/yyyyy").parse("01/01/2019");
            System.out.println(data);

        }catch (Exception e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Estou no bloco finally.");
        }
    }

}
