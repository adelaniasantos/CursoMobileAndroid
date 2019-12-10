package br.com.aulaexcecoes;

public class PessoaException extends RuntimeException {
    public  PessoaException(){
        super();//Referenciando construtor da classe pai
    }

    public PessoaException (String mensagem){
        super(mensagem);
    }

    public void testeException(){
        super.getCause();//Referenciando o metodo da classe pai
    }




}
