package com.kleberaluizio.livro;

public enum Cargo {
    DESENVOLVEDOR (new DezOuVintePorCento()),
    DBA(new QuinzeOuVintePorCento()),
    TESTER(new QuinzeOuVintePorCento());

    public RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra){
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
