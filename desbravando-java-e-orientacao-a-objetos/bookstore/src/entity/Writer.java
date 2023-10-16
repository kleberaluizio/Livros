package entity;

public class Writer {
    String name;
    String email;
    String cpf;

    void showDetails(){
        System.out.println("Showing Writer's information:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("--");
    }
}
