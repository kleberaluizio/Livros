package com.kleberaluizio.livro;

public class TesteSolucaoProposta {
    public static void main(String[] args) {
        Funcionario dev = new Funcionario("Kleber", 3000,Cargo.DESENVOLVEDOR);
        Funcionario tester = new Funcionario("Kleber", 2000,Cargo.TESTER);


        CalculadoraDeSalario calc = new CalculadoraDeSalario();
        double salarioLiquidoDev = calc.calcular(dev);
        double salarioLiquidoTester = calc.calcular(tester);
        System.out.println(salarioLiquidoDev);
        System.out.println(salarioLiquidoTester);

    }
}
