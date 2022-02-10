package com.org.gen.day2;

class Demo{
	Demo(){System.out.println(" Demo Class Default constructor");}
    Demo( int x)
    {this(); // this() use to invoke current class constructor
    	System.out.println("x = "+ x);}
	void m1() {
		System.out.println(" I am Method 1 ");
	}
	void m2() {
		System.out.println(" I am method 2 ");
		m1();//this.m1(); ----> using this to call/invoke the current class method 
	}
}


public class Example {
int id ; String name;
Example(int id , String name){
	this.id=id; this.name = name; // using this to recognize current class instance variable 
}
void display() {
	System.out.println(name +"  "+ id );
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example e = new Example(111, "dd");
Example e1= new Example(12, "XoXo");
e.display();e1.display();
Demo d1 = new Demo(10);
d1.m2();
	}

}
