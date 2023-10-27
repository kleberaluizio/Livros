package com.kleberaluizio.bookstore.test;

import com.kleberaluizio.bookstore.entity.Product;
import com.kleberaluizio.bookstore.entity.books.Ebook;
import com.kleberaluizio.bookstore.entity.books.PhysicalBook;
import com.kleberaluizio.bookstore.Writer;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
		ebook.setValue(39.90);

		ShoppingCart cart = new ShoppingCart();
		cart.add(physicalBook);
		cart.add(ebook);

		System.out.println("Total " +  cart.getTotal());

		List<Product> products = cart.getProducts();

		Collections.sort(products);
		for (Product product : products)
		{
			product.showDetails();
		}
	}
}
