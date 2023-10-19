package entity;

public class ShoppingCart
{
	private double total;
	public void add(Book book)
	{
		System.out.println("Adicionando: " + book);
		book.applyDiscountOf(0.05);
		total += book.getValue();
	}
	public double getTotal()
	{
		return total;
	}

}
