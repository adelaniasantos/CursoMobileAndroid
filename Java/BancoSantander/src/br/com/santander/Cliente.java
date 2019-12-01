package br.com.santander;

public class Cliente {

    private int numeroCliente;
    private String sobrenome;
    private String RG;

    public Cliente(int numeroCliente, String sobrenome, String RG, String CPF) {
        this.numeroCliente = numeroCliente;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CPF = CPF;
    }

    private String CPF;

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }



}
