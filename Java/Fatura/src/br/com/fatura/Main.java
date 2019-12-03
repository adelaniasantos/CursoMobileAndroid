package br.com.fatura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> listIntens = new ArrayList<>();

        Item item = new Item(1,"Monitor LG",5,400.00);
        Item item2 = new Item(1,"NoteBook Dell",10,2000.00);
        Item item3 = new Item(1,"Mouse",3,15.10);

        listIntens.add(item);
        listIntens.add(item2);
        listIntens.add(item3);

        Fatura fatura = new Fatura(listIntens);

        double dTotalFatura = fatura.getTotalFatura();
        System.out.println("O valor total da fatura é de :" + dTotalFatura);
    }
}
