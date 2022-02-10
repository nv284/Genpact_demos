package com.org.gen.day1;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice ;
		String menu;
Scanner sc = new Scanner(System.in);
System.out.println(" Enter your choice ");
System.out.println(" Enter 1 for Coffee ");
System.out.println(" Enter 2 for Tea ");
System.out.println(" Enter 3 for cold drink ");
System.out.println(" enter 4 for Main course ");
choice = sc.nextInt();
switch(choice) {
case 1:
	System.out.println(" Welcome  into the Hotel ABC food court");
	System.out.println(" Please enjoy your Coffee");
	break;
	
case 2:
	System.out.println(" Welcome in the xyz food court ");
	System.out.println(" Please Have your Tea");
	break;
	
case 3:
	System.out.println(" Welcome into ttt Hotel ");
	System.out.println(" Please enjoy your drink ");
	break;
	
case 4:
	System.out.println(" Welocme into hotel Dawat");
	System.out.println(" Please select our dishes ");
	mainCourse();
	break;
	
default :
	System.out.println(" Hotel is not serving sorry ");
}

	
}
	public static void mainCourse() {
		System.out.println("you get");
		System.out.println(" chhole bhatoore ");
		System.out.println(" Litti chokha");
		System.out.println(" Idili ");
		System.out.println(" Methi bajra puri");
		System.out.println(" dal bati churma");
	}

}
