package com.org.gen.day1;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age ;
Scanner  sc = new Scanner(System.in);
System.out.println(" Please enter Your Age : ");
age = sc.nextInt();

if(age <18) {
	System.out.println(" You are Minor ");
	System.out.println(" You are not eligible for Work !!");
}
else {
	if(age>=18 && age <=60) {
		System.out.println(" Your are eligible to work ");
		System.out.println("Please fill your details and apply ");
	}
	else {
		System.out.println(" You are too old to work as per the Govt rules ");
		System.out.println(" Please collect your pension ");
	}
}


	}

}
