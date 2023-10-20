package entity;

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
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
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
}
