package com.kleberaluizio.bookstore.test;

import com.kleberaluizio.bookstore.Writer;
import com.kleberaluizio.bookstore.entity.Product;
import com.kleberaluizio.bookstore.entity.books.Ebook;
import com.kleberaluizio.bookstore.entity.books.PhysicalBook;
import com.kleberaluizio.bookstore.entity.schoppingcart.ShoppingCart;
import java.util.Collections;
import java.util.List;

public class SortingWithJava
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

		List<Product> products = cart.getProducts();

		Collections.sort(products);
		for (Product product : products)
		{
			System.out.println(product.getValue());
		}
	}
}
