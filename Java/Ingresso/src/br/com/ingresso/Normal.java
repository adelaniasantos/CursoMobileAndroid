package br.com.ingresso;

public class Normal extends Ingresso {


    public Normal(double valor) {
        super.setValor(valor);
    }

    @Override
    public void imprimeValor() {

        System.out.println("O Valor do Ingresso Normal é de : " + getValor());
    }
}
