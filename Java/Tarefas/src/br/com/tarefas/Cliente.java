package br.com.tarefas;

public class Cliente extends Pessoa {

    private int codigo;

    public Cliente(int codigo, String nome, Data dataNascimento) {
        this.codigo = codigo;
        this.setNome(nome);
        this.setNascimento(dataNascimento);
    }

    @Override
    public void imprimeDados() {
        System.out.println("Codigo do Cliente: " + this.codigo +
                " - " +
                "Nome do Cliente: " + getNome()  +
                " - " +
                " Data de Nascimento: " + (getDataNascimento()));
    }
}
