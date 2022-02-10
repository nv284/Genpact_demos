package com.org.gen.day2;

class X{
	public void methodx() {
		System.out.println("Class X method");
	}
}
class Y extends X{
	public void methodY() {
		System.out.println("class y method");
	}
}
class P extends Y{
	void methodP() {
		System.out.println("class p method");
	}
}

public class ClassZ extends P{

	ClassZ(){
		System.out.println(" I am class Z");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassZ z = new ClassZ();
		z.methodP();z.methodx();z.methodY();

	}

}
