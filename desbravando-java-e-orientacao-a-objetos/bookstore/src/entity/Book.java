package entity;

public class Book {
    String title;
    String description;
    double value;
    String isbn;
    Writer writer;


    public void applyDiscountOf(double percentage){
        this.value -= this.value * percentage;
    }

    public boolean hasWriter(){
        return this.writer != null;
    }
    void showDetails(){
        String message ="Showing book's information:";
        System.out.println(message);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Value: " + value);
        System.out.println("ISBN: " + isbn);

        if(hasWriter()){
            writer.showDetails();
        }
    }
}
