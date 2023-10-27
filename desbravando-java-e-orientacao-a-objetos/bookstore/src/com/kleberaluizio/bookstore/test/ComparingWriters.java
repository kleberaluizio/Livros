package com.kleberaluizio.bookstore.test;

import com.kleberaluizio.bookstore.Writer;

public class ComparingWriters
{
	public static void main(String[] args)
	{
		Writer writer = new Writer();
		writer.setName("Rodrigo Turini");

		Writer sWriter = new Writer();
		sWriter.setName("Rodrigo Turini");

		if(writer.equals(sWriter)){
			System.out.println("Same writer!");
		}
	}
}
