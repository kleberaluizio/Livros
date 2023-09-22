package com.kleberaluizio.minha;

public class DBA extends Funcionario{

    public DBA(String name, double salarioBase) {
        super(name, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 0.85;
    }
}
