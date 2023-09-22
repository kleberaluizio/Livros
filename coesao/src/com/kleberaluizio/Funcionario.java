package com.kleberaluizio;

public abstract class Funcionario {
    String name;
    double salario;


    public Funcionario(String name, double salario) {
        this.name = name;
        this.salario = salario;
    }

    

    public String getName() {
        return name;
    }

    public double getSalario() {
        return salario;
    }
}
