package com.kleberaluizio.livro;

public class QuinzeOuVintePorCento implements RegraDeCalculo{

    @Override
    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000){
            return funcionario.getSalarioBase()* 0.85;
        } else {
            return funcionario.getSalarioBase()* 0.8;
        }
    }
}
