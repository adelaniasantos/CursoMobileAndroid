package br.com.empresaltda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionariosSuporte = new ArrayList<>();
        funcionariosSuporte.add(new Funcionario("Mariana Lima", 1000.00, "01/06/2019"));
        funcionariosSuporte.add(new Funcionario("Felipe Magalhaes", 2000.00, "02/01/2017"));
        funcionariosSuporte.add(new Funcionario("Michael Lopes", 5000.00, "01/06/2019"));

        List<Funcionario> funcionariosRH = new ArrayList<>();
        funcionariosRH.add(new Funcionario("Maiara Sousa", 3000.00, "25/06/2019"));
        funcionariosRH.add(new Funcionario("Brenda Martins", 3000.00, "01/02/2018"));

        List<Funcionario> funcionariosAdm = new ArrayList<>();
        funcionariosAdm.add(new Funcionario("Nelson Bomfim", 6000.00, "03/02/2015"));
        funcionariosAdm.add(new Funcionario("Mariana Talarico", 5000.00, "01/12/2015"));
        funcionariosAdm.add(new Funcionario("Julian Almeida", 6000.00, "01/06/2017"));
        funcionariosAdm.add(new Funcionario("Rodigo Lopes", 6000.00, "03/08/2015"));

        List<Departamento> departamentos = new ArrayList<>();
        departamentos.add(new Departamento("Suporte", funcionariosSuporte));
        departamentos.add(new Departamento("Recursos Humano", funcionariosRH));
        departamentos.add(new Departamento("Administrativo", funcionariosAdm));

        Empresa empresa = new Empresa("CPQI", "123.345.67/0001", departamentos);
        darAumentoDepartamento(departamentos, "Suporte", 10);

    
    }

    public static void darAumentoDepartamento(List<Departamento> departamentos, String deportamento, double percAumento){
        double novoSalario;
        List<Funcionario> funcionarios = new ArrayList<>();

        for (Departamento dep : departamentos) {
            if(dep.getNome().equals(deportamento)) {
                funcionarios = dep.getFuncionarios();

                System.out.println("Aumento de " + percAumento + "% Para os funcinarios do Departamento: " + dep.getNome());

                for (Funcionario func : funcionarios) {
                    novoSalario = func.getSalario() + (func.getSalario() * (percAumento / 100));
                    func.setSalario(novoSalario);
                    System.out.println("O Funcionario " + func.getNome() + " Teve o Salario atualizado para " + novoSalario);
                }
            }
        }
    }

    public static void alteraDepartamento(List<Departamento> departamentos, String nomeFuncionario, String novoDepartamento){
        List<Funcionario> funcionarios = new ArrayList<>();

      /*  for (Departamento dep : departamentos) {
            if(dep.getNome().equals(deportamento)) {
                funcionarios = dep.getFuncionarios();

                System.out.println("Aumento de " + percAumento + "% Para os funcinarios do Departamento: " + dep.getNome());

                for (Funcionario func : funcionarios) {
                    novoSalario = func.getSalario() + (func.getSalario() * (percAumento / 100));
                    func.setSalario(novoSalario);
                    System.out.println("O Funcionario " + func.getNome() + " Teve o Salario atualizado para " + novoSalario);
                }
            }
        }

       */
    }
}
