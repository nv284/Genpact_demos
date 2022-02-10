package com.org.gen.day1;

public class PrimitiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 10 ;
short  s = 2;
byte b = 6 ;
long l = 125362133223l;
float f = 65.20298f;
double d = 876.765d;
short b1 = (short) (s+a); //narrowing 

int x = b+ a ; //Widening 

System.out.println(" integer = "+ a);
System.out.println("short = "+s);
System.out.println("float = "+f);
System.out.println("double = "+d );

System.out.println(" narrowing = "+b1);
System.out.println(" Widening = "+x);

	}

}
