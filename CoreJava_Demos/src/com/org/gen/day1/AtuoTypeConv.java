package com.org.gen.day1;

public class AtuoTypeConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 10 ;
System.out.println(" integer value is : "+ num);

double data = num ; 
System.out.println(" double value is :"+ data );

int x = (int)data ;

String s = String.valueOf(num);

System.out.println(" converted into string : "+ s);

//string to int 

int y = Integer.parseInt(s);
System.out.println(" String to Int : "+ y);
	}

}
