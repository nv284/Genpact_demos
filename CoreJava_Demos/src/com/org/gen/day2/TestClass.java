package com.org.gen.day2;
class A {
	void msg(int x , int y ) {
		System.out.println(" Hello x and y ");
	}
}

class B extends A{
	void msg(double x , double y ) {
		System.out.println(" welcome you in java programing ");
	}
}
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.msg(2.5,3.2 );
		b.msg(10, 20);

	}

}
