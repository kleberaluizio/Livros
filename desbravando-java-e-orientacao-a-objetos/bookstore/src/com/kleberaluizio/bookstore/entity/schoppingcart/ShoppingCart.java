package com.kleberaluizio.bookstore.entity.schoppingcart;

import com.kleberaluizio.bookstore.entity.Product;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
	private double total;
	private List<Product> products = new ArrayList<>();

	public void add(Product product)
	{
		this.products.add(product);
		this.total += product.getValue();
	}

	public void remove(Product product)
	{
		this.products.remove(product);
	}

	public double getTotal()
	{
		return total;
	}

	public List<Product> getProducts()
	{
		return this.products;
	}
}
