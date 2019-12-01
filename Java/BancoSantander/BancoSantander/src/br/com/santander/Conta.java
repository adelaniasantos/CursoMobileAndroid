package br.com.santander;

public abstract class Conta {
    private Cliente cliente;
    private double saldo;

    public Cliente getCliente() {
        return cliente;
    }


    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract String sacar(double valor);

    public String depositar(double valor){
        this.saldo += valor;
        return "Deposito realizado com sucesso.";
    }
    public String consultar(){
      return "Seu saldo é de " + this.saldo;
     }
}
