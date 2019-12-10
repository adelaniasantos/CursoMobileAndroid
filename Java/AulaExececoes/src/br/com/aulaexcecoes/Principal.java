package br.com.aulaexcecoes;

public class Principal {
    public static void main(String[] args) {
        String nome = "Jess";
        int idade = 18;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Milena");

        System.out.println("Nome pessoa " + pessoa.getNome());

        try {
            pessoa.mostrarNome();
        }catch (PessoaException px){
            px.testeException();
            px.getCause();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
