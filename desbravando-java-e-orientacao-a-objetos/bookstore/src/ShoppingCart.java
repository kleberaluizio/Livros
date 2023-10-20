import entity.books.Book;
import entity.revistas.Magazine;

public class ShoppingCart
{
	private double total;
	public void add(Book book)
	{
		System.out.println("Adicionando: " + book);
		book.applyDiscountOf(0.05);
		total += book.getValue();
	}

	public void add(Magazine magazine)
	{
		System.out.println("Adicionando: " + magazine);
		magazine.applyDiscountOf(0.05);
		total += magazine.getValue();
	}
	public double getTotal()
	{
		return total;
	}

}
