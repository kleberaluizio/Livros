package com.kleberaluizio.bookstore.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PerformanceTesting
{
	public static void main(String[] args)
	{
		Set<String> collection = new HashSet<>();
//		List<String> collection = new ArrayList<>();

		for(int i = 0; i < 10000; i++){
			collection.add("Item " + i);
		}

		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			collection.contains("Item " + i);
		}
		long finishTime = System.currentTimeMillis();
		long timeToVerify = finishTime - startTime;

		System.out.println("It took "+ timeToVerify + "ms to execute!");
	}
}
