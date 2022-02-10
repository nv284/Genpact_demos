package com.org.gen.day2;

public class SchoolDay {

	String name = " Mark"; // instance variable 
	
	SchoolDay(){
		int id = 123; 
		System.out.println(" Id of student "+ id);
	}
	public void mySchool() {
		String schoolname = "SSM"; //local variable
		System.out.println("Name of School : "+ schoolname);
	}
	public void mySchool1() {
		//System.out.println("Name of school :"+ schoolname);
		System.out.println(" name = "+ name ); // 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SchoolDay sc = new SchoolDay();
sc.mySchool();
	}

}
