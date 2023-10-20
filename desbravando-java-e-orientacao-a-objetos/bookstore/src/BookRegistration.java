import entity.books.Book;
import entity.books.PhysicalBook;
import entity.Writer;

public class BookRegistration {
    public static void main(String[] args) {

        Writer writer = new Writer();
        writer.setName("Rodrigo Turini");
        writer.setEmail("rodrigo.turini@caelum.com.br");
        writer.setCpf("123.456.789-10");

        Book book = new PhysicalBook(writer);
        book.setTitle("Java 8 Prático");
        book.setDescription("Novos recursos da linguagem");
        book.setValue(59.90);
        book.setIsbn("978-85-66250-46-6");

        book.showDetails();

        Writer otherWriter = new Writer();
        otherWriter.setName("Paulo Silveira");
        otherWriter.setEmail("paulo.silveira@caelum.com.br");
        otherWriter.setCpf("123.456.789-11");


        Book otherBook = new PhysicalBook(otherWriter);
        otherBook.setTitle("Lógica de programação");
        otherBook.setDescription("Crie seus primeiros programas");
        otherBook.setValue(59.90);
        otherBook.setIsbn("978-85-66250-22-0");

        otherBook.showDetails();
    }
}
