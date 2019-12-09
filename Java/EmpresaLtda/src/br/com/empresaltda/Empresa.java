package br.com.empresaltda;

import java.util.List;

public class Empresa {
    private String Nome;
    private String cnpj;
    private List<Departamento> departamentos;

    public Empresa(String nome, String cnpj, List<Departamento> departamentos) {
        Nome = nome;
        this.cnpj = cnpj;
        this.departamentos = departamentos;
    }

    public Empresa(String nome, String cnpj) {
        Nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
}
