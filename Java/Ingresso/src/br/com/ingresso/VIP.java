package br.com.ingresso;

public abstract class VIP extends Ingresso {

    private double valorAdicional;
    public String localizacao;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void imprimeLocalizacao(){
        System.out.println("A localização do ingresso é: " + this.localizacao);
    }

}
