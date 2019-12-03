package br.com.fatura;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
   private List<Item> listIntens = new ArrayList<>();

    public Fatura(List<Item> listIntens) {
        this.listIntens = listIntens;
    }

    public double getTotalFatura(){
        double dValorTotal = 0d;
        double dValorTotalItem = 0d;

        for (Item item: listIntens) {

         dValorTotalItem = (item.getQuantidade() * item.getPrecoUnitario());
            System.out.println("Item : " + item.getDescricao() + " - " + "Preço total do Item : " + dValorTotalItem);

            dValorTotal +=dValorTotalItem;
        }

        return dValorTotal;
    }

}
