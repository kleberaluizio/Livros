package com.kleberaluizio.livro;


public class CalculadoraDeSalario {

    public double calcular(Funcionario funcionario){

//        RegraDeCalculo regraDeCalculo = funcionario.getCargo().getRegra(); // ANTIGO
        RegraDeCalculo regraDeCalculo = funcionario.getRegra();

        return regraDeCalculo.calcula(funcionario);
    }
}
