package br.com.empresaltda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Departamento> departamentos = new ArrayList<>();
        List<Funcionario> funcionariosSuporte = new ArrayList<>();

        Empresa cpqi = new Empresa("CPQI", "123.345.67/0001");



        departamentos.add(new Departamento("Suporte", funcionariosSuporte));
        //departamentos.add(departamento2);
       // departamentos.add(departamento3);



    }
}
