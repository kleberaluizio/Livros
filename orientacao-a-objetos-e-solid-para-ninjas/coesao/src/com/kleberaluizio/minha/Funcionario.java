package com.kleberaluizio.minha;

public abstract class Funcionario {
    String name;
    double salarioBase;


    public Funcionario(String name, double salarioBase) {
        this.name = name;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getName() {
        return name;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
