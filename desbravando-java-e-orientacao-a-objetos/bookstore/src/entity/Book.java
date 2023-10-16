package entity;

public class Book {
    String title;
    String description;
    double value;
    String isbn;
    Writer writer;


    public void applyDiscountOf(double percent){
        this.value -= value * percent;
    }
    void showDetails(){
        String message ="Showing book's information:";
        System.out.println(message);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Value: " + value);
        System.out.println("ISBN: " + isbn);
        writer.showDetails();
    }
}
