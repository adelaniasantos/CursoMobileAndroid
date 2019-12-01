package br.com.santander;

public class Principal {

    public static void main (String[] args){

        Cliente cliente1 = new Cliente(350,"Adelania", "67.876.076-8", "350.440.229-54");
        ContaCorrente cc = new ContaCorrente(cliente1);
        System.out.println(cc.depositar(400));
        System.out.println(cc.consultar());
        System.out.println(cc.sacar(499));

    }
}
