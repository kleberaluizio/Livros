package com.kleberaluizio.bookstore.test;

import static java.util.Comparator.comparing;

import com.kleberaluizio.bookstore.Writer;
import com.kleberaluizio.bookstore.entity.books.Book;
import com.kleberaluizio.bookstore.entity.books.PhysicalBook;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewOfJava8
{
	public static void main(String[] args)
	{
		Writer writer = new Writer();
		writer.setName("Rodrigo Turini");

		Book ruby = new PhysicalBook(writer);
		ruby.setTitle("Livro de Ruby");
		Book javaoo = new PhysicalBook(writer);
		javaoo.setTitle("Java 0.0.");
		Book java8 = new PhysicalBook(writer);
		java8.setTitle("Java 8 Prático");
		Book html = new PhysicalBook(writer);
		html.setTitle("Html");


		List<Book> books = Arrays.asList(javaoo, java8, ruby, html);
//		filterBooksByName(books);

		IntStream intStream = IntStream.of(122,31,4,5);
		intStream.forEach(System.out::println);

	}
	private static void compareAndSortBooks(List<Book> books){

		books.sort(comparing(Book::getTitle));

		for (Book book : books)
		{
			System.out.println(book.getTitle());
		}
		//		Collections.sort(books, new CompareByName());

//		Collections.sort(books, new Comparator<Book>()
//		{
//			@Override
//			public int compare(Book o1, Book o2)
//			{
//				return o1.getTitle().compareTo(o2.getTitle());
//			}
//		});

//		books.sort(comparing(l -> l.getTitle()));
	}
	private static void filterBooksByName(List<Book> books){

		books.stream()
			.filter(l -> l.getTitle().contains("Java"))
			.forEach(l-> System.out.println(l.getTitle()));

//		List<Book> filteredBooks = new ArrayList<>();
//
//		for (Book book : books)
//		{
//			if(book.getTitle().contains("Java")){
//				filteredBooks.add(book);
//			}
//		}
//
//		for (Book filteredBook : filteredBooks)
//		{
//			System.out.println(filteredBook.getTitle());
//		}
	}
}
