package br.com.fiap.banco.model;

public class Funcionario {
    private int codigo;
    private String nome;
    private double salario;
    private boolean ativo;
    private String email;

    public Funcionario(int codigo, String nome, double salario, boolean ativo, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
        this.ativo = ativo;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
