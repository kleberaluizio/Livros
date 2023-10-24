package Utils;

import entity.Product;
import entity.books.Book;
import entity.revistas.Magazine;

public class ShoppingCart
{
	private double total;
	public void add(Product product)
	{
		System.out.println("Adding: " + product);
		total += product.getValue();
	}

	public double getTotal()
	{
		return total;
	}

}
