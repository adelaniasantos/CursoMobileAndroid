package br.com.fatura;

public class Item {

    private int numeroItem;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Item(int numeroItem, String descricao, int quantidade, double precoUnitario) {

        this.numeroItem = numeroItem;
        this.descricao = descricao;

        if(quantidade < 0){
            this.quantidade = 0;
        }else{
            this.quantidade = quantidade;
        }

        if(precoUnitario < 0){
            this.precoUnitario = 0;
        }else{
            this.precoUnitario = precoUnitario;
        }


    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }


}
