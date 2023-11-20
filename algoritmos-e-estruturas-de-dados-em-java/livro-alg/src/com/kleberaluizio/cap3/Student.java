package com.kleberaluizio.cap3;

public class Student
{
	private String name;

	private String getName(){
		return this.name;
	}
	private void setName(String name){
		this.name = name;
	}

	public String toString(){
		return this.name;
	}

	public boolean equals (Object o){
		Student other = (Student) o;
		return this.name.equals(other.name);
	}
}
