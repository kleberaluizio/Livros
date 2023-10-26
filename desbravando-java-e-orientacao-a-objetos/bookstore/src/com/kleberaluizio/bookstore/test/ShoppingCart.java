package com.kleberaluizio.bookstore.test;

import com.kleberaluizio.bookstore.entity.Product;

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
