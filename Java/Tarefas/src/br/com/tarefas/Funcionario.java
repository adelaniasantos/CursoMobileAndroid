package br.com.tarefas;

public class Funcionario extends Pessoa {
    protected float salario;

    public Funcionario(float salario, String nome, Data dataNascimento) {
        this.salario = salario;
        this.setNome(nome);
        this.setNascimento(dataNascimento);
    }

    public float calculaImposto(){
        float imposto;
        imposto = this.salario * 0.03f;

        return imposto;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nome do Funcionario: " + getNome()  +
                " - " +
                " Data de Nascimento: " + getDataNascimento() +
                " - " +
                "Salario: " + this.salario +
                " - " +
                "Valor do Imposto: " + calculaImposto());
    }
}
