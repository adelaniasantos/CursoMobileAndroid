package br.com.tarefas;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private int quantidadeAutal;
    private List<Pessoa> listaPessoa = new ArrayList<>();

    public int getQuantidadeAutal() {
        return quantidadeAutal;
    }

    public void setQuantidadeAutal(int quantidadeAutal) {
        this.quantidadeAutal = quantidadeAutal;
    }

    public void cadastrarPessoa(Pessoa pessoa){
        listaPessoa.add(pessoa);
    }

    public void imprimirCadastro(){
        for (int i = 0; i < listaPessoa.size(); i++) {
            listaPessoa.get(i).imprimeDados();
        }
    }

}
