package com.kleberaluizio.bookstore.entity;

public interface Promotional
{
	boolean applyDiscountOf(double percentage);
	default boolean applyDiscountOf10Percent(){
		return applyDiscountOf(0.1);
	}
}
