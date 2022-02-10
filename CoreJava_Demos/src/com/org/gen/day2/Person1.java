package com.org.gen.day2;

public class Person1 {
	String name ;
	int age;
	String address;
	
//default
	public Person1() {
		super();
		name="Rajeev"; age=21;
		System.out.println(name +"  "+age+"  "+address);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person1  p1 = new Person1();//calling default cons
	}

	
}
