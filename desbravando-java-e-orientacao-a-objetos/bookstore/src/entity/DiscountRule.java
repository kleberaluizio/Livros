package entity;

public class DiscountRule {

    public static void main(String[] args) {
        Book book = new Book();
        book.setValue(59.90);

        System.out.println("Current value: " + book.getValue());

        if(!book.applyDiscountOf(0.1)){
            System.out.println("Discount can not be higher than 30%");
        } else {
            System.out.println("Discount value: " + book.getValue());
        }
    }
}
