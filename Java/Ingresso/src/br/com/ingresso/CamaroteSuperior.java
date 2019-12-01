package br.com.ingresso;

public class CamaroteSuperior extends VIP{

    private double valorAdicionalCamarote;

    public CamaroteSuperior(double valorIngresso, double valorAdicional, String localizacao, double valorAdicionalCamarote) {
        super.setValor(valorIngresso);
        super.setValorAdicional(valorAdicional);
        super.setLocalizacao(localizacao);
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    @Override
    public void imprimeValor() {
        System.out.println("O valor do Ingresso VIP é de: " + (getValor() + this.valorAdicionalCamarote + super.getValorAdicional()));

    }
}
