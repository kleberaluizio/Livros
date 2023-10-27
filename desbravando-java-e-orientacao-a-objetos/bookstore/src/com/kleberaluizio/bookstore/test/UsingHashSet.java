package com.kleberaluizio.bookstore.test;

import java.util.HashSet;
import java.util.Set;

public class UsingHashSet
{
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();

		set.add("There is no equals elements in this set!");
		set.add("There is no equals elements in this set!");
		set.add("There is no equals elements in this set!");
		set.add("There is no equals elements in this set!");
		set.add("There is no equals elements in this set!");
		set.add("There is no equals elements in this set!");
		System.out.println(set.size());

	}
}
