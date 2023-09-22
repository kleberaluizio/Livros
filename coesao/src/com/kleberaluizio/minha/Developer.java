package com.kleberaluizio.minha;

public class Developer extends Funcionario{

    public Developer(String name, double salario) {
        super(name, salario);
    }

    @Override
    public double calcularSalario(){
        if(getSalarioBase() > 3000){
            return this.getSalarioBase()* 0.8;
        } else {
            return this.getSalarioBase()* 0.8;
        }
    }

}
