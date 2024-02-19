package com.javaefetivo;

import com.javaefetivo.builderpattern.NutritionFacts;

public class Main
{
	public static void main(String[] args)
	{
		NutritionFacts nf = new NutritionFacts.Builder(240,8)
			.calories(100).sodium(35).carbohydrate(27).build();

		System.out.println(nf.toString());
	}
}