package br.com.tarefas;

public class Gerente extends Funcionario {
    private String area;

    public Gerente(float salario, String nome, Data dataNascimento, String area) {
        super(salario, nome, dataNascimento);
        this.area = area;
    }

    @Override
    public float calculaImposto(){
        float imposto;
        imposto = super.salario * 0.05f;
        return imposto;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nome do Gerente: " + getNome()  +
                " - " +
                " Data de Nascimento: " + getDataNascimento() +
                " - " +
                "Salario: " + this.salario +
                " - " +
                "Valor do Imposto: " + calculaImposto() +
                " - " +
                "Setor de Trabalho: " + this.area);
    }
}
