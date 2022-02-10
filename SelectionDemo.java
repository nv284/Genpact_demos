package com.org.gen.day1;

import java.util.Scanner;

public class SelectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
System.out.println("Enter the test score ");
String scoreString = kb.nextLine();
double score = Double.parseDouble(scoreString); // string to double 

if(score >60) {
	System.out.println(" You are doing very well");
	System.out.println("Good Job!!!");
}else if(score==60){
	System.out.println(" You barely passed ");
	System.out.println("Better brush up");
}
else {
	System.out.println(" try again ");
}

	}

}
