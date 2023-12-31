package com.kleberaluizio.bookstore;

import java.util.Objects;

public class Writer {
    private String name;
    private String email;
    private String cpf;

    public Writer(String name){
        this.name = name;
    }
    public Writer(){

    }


    public void showDetails(){
        System.out.println("Showing Writer's information:");
        System.out.println("Name: " + name);
        if(email != null) System.out.println("Email: " + email);
        if(cpf != null) System.out.println("CPF: " + cpf);
        System.out.println("--");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Writer writer = (Writer) o;
        return Objects.equals(name, writer.name) && Objects.equals(email, writer.email)
            && Objects.equals(cpf, writer.cpf);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, email, cpf);
    }
}
