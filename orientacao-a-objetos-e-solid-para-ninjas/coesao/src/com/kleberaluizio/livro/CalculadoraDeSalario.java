package com.kleberaluizio.livro;


public class CalculadoraDeSalario {

    public double calcular(Funcionario funcionario){

        RegraDeCalculo regraDeCalculo = funcionario.getCargo().getRegra();

        return regraDeCalculo.calcula(funcionario);
    }
}
