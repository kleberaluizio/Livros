package com.kleberaluizio.bookstore.entity.books;

import com.kleberaluizio.bookstore.entity.Product;
import com.kleberaluizio.bookstore.Writer;
import com.kleberaluizio.bookstore.exceptions.NullWriterException;

public abstract class Book implements Product
{
	private String title;
	private String description;
	private double value;
	private String isbn;
	private Writer writer;


	public Book(Writer writer)
	{
		this(); // Call empty constructor
		if(writer == null){
			throw new NullWriterException("Book's writer can not be null!");
		}
		this.writer = writer;
	}

	public Book()
	{
		this.isbn = "000-00-00000-00-0";
	}

	public boolean hasWriter()
	{
		return this.writer != null;
	}

	public void showDetails()
	{
		String message = "Showing book's information:";
		System.out.println(message);
		System.out.println("Title: " + title);
		if(description != null)System.out.println("Description: " + description);
		System.out.println("Value: " + value);
		System.out.println("ISBN: " + isbn);

		if (hasWriter())
		{
			writer.showDetails();
		}
	}

	public void setValue(double value)
	{
		this.value = value;
	}

	public double getValue()
	{
		return this.value;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getIsbn()
	{
		return isbn;
	}

	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public Writer getWriter()
	{
		return writer;
	}

	public void setWriter(Writer writer)
	{
		this.writer = writer;
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
