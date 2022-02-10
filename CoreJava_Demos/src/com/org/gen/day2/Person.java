package com.org.gen.day2;
// in this code we are not writing any construtor for this class , so after compilation jvm will create construtor for us 
public class Person {

	String name ; int age ; String address; // instance variable
	
	void display() {
		System.out.println(name+"  "+ age +"   "+ address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Person p = new Person(); //calling default cons
   p.display();
	}

}
