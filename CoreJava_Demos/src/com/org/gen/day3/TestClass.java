package com.org.gen.day3;

abstract class Myclass{
	int x = 100;
	abstract void calculate(int a , int b);

	public int datacount(int a ) {
		return a*a;
	}
	public Myclass() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(" Abstract class construtor");
	}
public static void call() {
		System.out.println(" This is static method ");
	}
final void m1() {
	System.out.println("final method ");
}
}

class Addition extends Myclass {


	@Override
	void calculate(int a, int b) {
		// TODO Auto-generated method stub
		int x = a+b;
		System.out.println("sum = "+ x);
	}
}
class Subtraction extends Myclass{


	@Override
	void calculate(int a, int b) {
		// TODO Auto-generated method stub
		int y = a-b;
		System.out.println(" Subtract : "+y);
	}
}


public class TestClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition a = new Addition();
Subtraction s = new Subtraction();
a.calculate(10,20);s.calculate(20, 30);
	}

}
