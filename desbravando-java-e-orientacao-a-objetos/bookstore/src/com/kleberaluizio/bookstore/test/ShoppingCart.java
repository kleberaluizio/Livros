package com.kleberaluizio.bookstore.test;

import com.kleberaluizio.bookstore.entity.Product;

public class ShoppingCart
{
	private double total;
	private Product[] products = new Product[10];
	private int counter=0;
	public void add(Product product)
	{
		System.out.println("Adding: " + product);
		this.products[counter] = product;
		counter++;
		total += product.getValue();
	}

	public double getTotal()
	{
		return total;
	}

	public void getProducts(){
		for (Product product : products)
		{
			if(product != null){
				System.out.println(product.getValue());
			}
		}
	}
}
