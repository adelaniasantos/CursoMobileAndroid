package br.com.tarefas;

public class TestaCadastro {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(234, "Adelania", new Data(23,13,1985));
        Funcionario funcionario = new Funcionario(10000.00f,"Rodrigo", new Data(28,02,1988));
        Gerente gerente = new Gerente(10000.00f,"Juliana", new Data(30,11,1976), "Vendas");

        CadastroPessoas cadastroPessoas = new CadastroPessoas();

        cadastroPessoas.cadastrarPessoa(cliente);
        cadastroPessoas.cadastrarPessoa(funcionario);
        cadastroPessoas.cadastrarPessoa(gerente);

        cadastroPessoas.imprimirCadastro();

    }
}
