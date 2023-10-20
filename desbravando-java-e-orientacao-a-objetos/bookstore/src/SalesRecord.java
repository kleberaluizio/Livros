import entity.books.Ebook;
import entity.books.PhysicalBook;
import entity.Writer;

public class SalesRecord
{
	public static void main(String[] args)
	{
		Writer writer = new Writer("Mauricio Aniche");

		PhysicalBook physicalBook = new PhysicalBook(writer);
		physicalBook.setTitle("Test-Driven Development");
		physicalBook.setValue(59.90);

		Ebook ebook = new Ebook(writer);
		ebook.setTitle("Test-Driven Development");
		ebook.setValue(29.90);

		ShoppingCart cart = new ShoppingCart();
		cart.add(physicalBook);
		cart.add(ebook);

		System.out.println("Total " +  cart.getTotal());
	}
}
