package entity;

public class DiscountRule {

    public static void main(String[] args) {

        Writer writer = new Writer("Rodrigo Turini");

        Book book = new Book(writer);
        book.setValue(59.90);

        if(!book.applyDiscountOf(0.3)){
            System.out.println("Book's discount can not be higher than 30%");
        } else {
            System.out.println("Book's discount value: " + book.getValue());
        }

        Ebook ebook = new Ebook(writer);
        ebook.setValue(29.90);

        if(!ebook.applyDiscountOf(0.15)){
            System.out.println("Ebook's discount can not be higher than 15%");
        } else {
            System.out.println("Ebook's discount value: " + ebook.getValue());
        }



    }
}
