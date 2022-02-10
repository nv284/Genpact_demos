package com.org.gen.day2;

public class Number {

	int a = 10; int b = 20;
	//default step1
	Number(){}
	//copy constructor
	Number(Number n )
	{a=n.a; b=n.b;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step 3 
		Number n = new Number();
		System.out.println("Vlaue of a "+ n.a);//10
		System.out.println("Vlaue of b "+n.b);//20
//step 4
		n.a = 50;
		n.b = 40;
		System.out.println("Updating values of a and b in the existing object ");
		System.out.println("Vlaue of a "+n.a);//50
		System.out.println("Vlaue of b "+n.b);//40
		
//step 5
		Number n2 = new Number();
		System.out.println(" Not getting updated values of a , b in the new object");
		System.out.println("Vlaue of a "+n2.a);//10
		System.out.println("value of b "+n2.b);//20
//step 6
		Number n3 = new Number(n);
		System.out.println("getting update values of a and b in the new object");
		System.out.println("Value of a "+n3.a);//10
		System.out.println("Value of b "+n3.b);//20
		//50 , 40
	}

}
