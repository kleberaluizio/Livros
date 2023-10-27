package com.kleberaluizio.bookstore.entity;

public interface Product extends Comparable<Product>
{
	double getValue();
	void showDetails();
}
