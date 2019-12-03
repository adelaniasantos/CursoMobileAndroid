package br.com.estoque;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;

        if(qtdMinima >= 0) {
            this.qtdMinima = qtdMinima;
        }else{
            this.qtdMinima = 0;
        }

        if(qtdAtual >= 0){
            this.qtdAtual = qtdAtual;
        }else{
            this.qtdAtual = 0;
        }
    }

    public void mudarNome(String nome){
        this.nome = nome;
    }

    public void mudarQtdMinima(int qtdMinima){
        if(this.qtdMinima >= 0) {
            this.qtdMinima = qtdMinima;
        }else{
            System.out.println("A quantidade minima não pode ser menor que zero.");
        }
    }

    public void repor(int qtd){
        this.qtdAtual += qtd;
    }

    public void darBaixa(int qtd){
        this.qtdAtual -= qtd;
    }

    public String mostra(){
        return  "Produto: " + this.nome +
                " - Quantidade Minima: " + this.qtdMinima +
                " - Quantidade Atual: " + this.qtdAtual;
    }

    public boolean precisaRepor(){
        return this.qtdAtual <= this.qtdMinima;
    }

}
