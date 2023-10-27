package com.kleberaluizio.bookstore.entity.revistas;

import com.kleberaluizio.bookstore.Editora;
import com.kleberaluizio.bookstore.entity.Product;
import com.kleberaluizio.bookstore.entity.Promotional;

public class Magazine implements Product, Promotional
{
	private String name;
	private String description;
	private double value;
	private Editora editora;

	@Override
	public boolean applyDiscountOf(double percentage)
	{
		if (percentage > 0.1)
		{
			return true;
		}
		double discount = getValue() * percentage;
		setValue(getValue() - discount);
		return false;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public double getValue()
	{
		return value;
	}

	@Override
	public void showDetails()
	{
		String message = "Showing Magazine's information:";
		System.out.println(message);
		System.out.println("Title: " + name);
		System.out.println("Description: " + description);
		System.out.println("Value: " + value);

	}

	public void setValue(double value)
	{
		this.value = value;
	}

	public Editora getEditora()
	{
		return editora;
	}

	public void setEditora(Editora editora)
	{
		this.editora = editora;
	}


	@Override
	public int compareTo(Product otherProduct)
	{
		if(this.getValue() < otherProduct.getValue()){
			return -1;
		}
		if(this.getValue() > otherProduct.getValue()){
			return 1;
		}
		return 0;

	}
}
