package com.kleberaluizio.livro;

public class Funcionario {
    String name;
    double salarioBase;
    Cargo cargo;


    public Funcionario(String name, double salarioBase, Cargo cargo) {
        this.name = name;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public String getName() {
        return name;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public RegraDeCalculo getRegra() {
        return cargo.getRegra();
    }
}
