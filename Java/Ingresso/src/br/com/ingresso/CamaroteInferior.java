package br.com.ingresso;

public class CamaroteInferior extends VIP{

    public CamaroteInferior(double valorIngresso, double valorAdicional, String localizacao) {
        super.setValor(valorIngresso);
        super.setValorAdicional(valorAdicional);
        super.setLocalizacao(localizacao);
    }

    @Override
    public void imprimeValor() {
        System.out.println("O valor do Ingresso VIP é de :" + (super.getValor() + super.getValorAdicional()));
    }
}
