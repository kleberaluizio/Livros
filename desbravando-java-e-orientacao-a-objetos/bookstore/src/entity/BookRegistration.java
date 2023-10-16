package entity;

public class BookRegistration {
    public static void main(String[] args) {

        Writer writer = new Writer();
        writer.name = "Rodrigo Turini";
        writer.email = "rodrigo.turini@caelum.com.br";
        writer.cpf = "123.456.789-10";

        Book book = new Book();
        book.title = "Java 8 Prático";
        book.description = "Novos recursos da linguagem";
        book.value = 59.90;
        book.isbn = "978-85-66250-46-6";

        book.writer = writer;

        book.showDetails();

        Writer otherWriter = new Writer();
        otherWriter.name = "Paulo Silveira";
        otherWriter.email = "paulo.silveira@caelum.com.br";
        otherWriter.cpf = "123.456.789-11";


        Book otherbook = new Book();
        otherbook.title = "Lógica de programação";
        otherbook.description = "Crie seus primeiros programas";
        otherbook.value = 59.90;
        otherbook.isbn = "978-85-66250-22-0";

        otherbook.writer = otherWriter;

        otherbook.showDetails();
    }
}
