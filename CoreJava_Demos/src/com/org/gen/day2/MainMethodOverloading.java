package com.org.gen.day2;

public class MainMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("main(String[] args)");
    main();
    main("Hi");
    main("A", "B");
	}
	
	public static void main() {
		System.out.println(" main without args");
	}

	public static void main(String args) {
		System.out.println("main with string args");
	}
	public static void main(String args1 , String args2) {
		System.out.println(" main method with two args ");
	}
}
/* void sum(int a , int b , int c)
 * void sum(int c , int b , int a)
 * 
 * int sum(int a , int b)
 * int sum(double a , double b)
 * 
 * void msg(Object o , char a )
 * void msg(char x)
 * 
 * Object msg(String s )
 * String msg(String a) 
 * 
 * */
 