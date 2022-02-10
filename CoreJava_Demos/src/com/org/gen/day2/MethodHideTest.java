package com.org.gen.day2;

//in method overriding, method call is resolved by JVM  based on runtime Object( new Object)

//in method hiding , method call is resolved by the compiler based on the reference type (Object obj).

class ParentClass{
	public static void classMethod() {
		System.out.println("classMethod in Parent class");
	}
	public void instanceMethod() {
		System.out.println(" Instance method in Parent class");
	}
}
class ChildClass extends ParentClass{
	public static void classMethod() {
		System.out.println(" classmethod in child class");
	}
	public void instanceMethod() {
		System.out.println(" Instance method in child class");
	}
}


public class MethodHideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentClass p = new ChildClass();
p.classMethod();// calling with ref -->method hiding 
p.instanceMethod();// calling with obj--> method overriding

ChildClass c = new ChildClass();
c.classMethod();//hiding 
c.instanceMethod();//overriding


ParentClass p1 = new ParentClass();
p1.classMethod();
p1.instanceMethod();


	}

}
