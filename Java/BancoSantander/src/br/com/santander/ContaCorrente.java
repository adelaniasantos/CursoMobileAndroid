package br.com.santander;

public class ContaCorrente extends Conta {

    private double limite = 300;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String sacar(double valor) {
        double novoSaldo = 0;
        String mensagem = "";

        if(valor <= super.getSaldo()){
            novoSaldo = super.getSaldo() - valor;
            super.setSaldo(novoSaldo);
            mensagem = "Saque realizado com sucesso. Seu novo saldo é de : " + super.getSaldo();
        }else if(valor <= super.getSaldo() + this.limite){
            novoSaldo = super.getSaldo() - valor;
            super.setSaldo(novoSaldo);
            mensagem = "Saque realizado com sucesso. Seu novo saldo é de : " + super.getSaldo();
       }else {
            mensagem = "Saque não realizado. Saldo Insuficiente.";
        }

        return mensagem;
    }

    @Override
    public String depositar(double valor) {
        return  super.depositar(valor);
    }

    public String depositar(Cheque cheque){

        this.setSaldo(this.getSaldo() + cheque.getValor());
        return "Deposito realizado com sucesso. Seu novo saldo é de " + this.getSaldo();
    }

    @Override
    public String consultar() {
        return super.consultar();
    }
}
