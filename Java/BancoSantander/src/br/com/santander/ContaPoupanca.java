package br.com.santander;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String sacar(double valor) {
        double novoSaldo = 0;
        String mensagem = "";

        if(valor <= super.getSaldo()){
            novoSaldo = super.getSaldo() - valor;
            super.setSaldo(novoSaldo);
            mensagem = "Saque realizado com sucesso. Seu novo saldo é de : " + super.getSaldo();
        }else{
            mensagem = "Saldo Insuficiente";
        }

        return mensagem;
    }

    @Override
    public String depositar(double valor) {
        return super.depositar(valor);
    }

    @Override
    public String consultar() {
       return super.consultar();
    }

    public double recolherTaxas(double juros){
        return  0;
    }
}
