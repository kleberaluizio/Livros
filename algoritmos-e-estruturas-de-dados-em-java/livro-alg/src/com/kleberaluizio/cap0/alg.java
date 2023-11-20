package com.kleberaluizio.cap0;

public class alg
{
	public static void main(String[] args)
	{
		double[] heights = {1.6, 1.70, 1.55, 1.79};

		findTheHighest(heights);
		findTheShortest(heights);
	}
	public static void findTheHighest(double[] arr)
	{
		double highestHeight = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if(highestHeight < arr[i]){
				highestHeight = arr[i];
			}
		}
		System.out.println("The highest height among people in line is "+highestHeight);
	}

	public static void findTheShortest(double[] arr)
	{
		double shortestHeight = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if(shortestHeight > arr[i]){
				shortestHeight = arr[i];
			}
		}
		System.out.println("The shortest height among people in line is "+shortestHeight);
	}
}
