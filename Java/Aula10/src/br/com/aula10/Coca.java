package br.com.aula10;

import java.util.Objects;

public class Coca {

    private int tamanho;
    private double preco;

    public Coca(int tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coca)) return false;
        Coca coca = (Coca) o;
        return tamanho == coca.tamanho;
    }


}
