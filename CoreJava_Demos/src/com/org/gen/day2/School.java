package com.org.gen.day2;

public class School {
	String scName; int esyear;
	//default 
	School(){
		scName="DPS"; esyear = 1975;
	}
	//Parameterized 
School(String name ){
	scName= name; 
}
School(String name , int year ){
	scName = name ; esyear = year;
}
void display() {
	System.out.println("School Name - "+scName+ " Year - "+ esyear);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
School sc = new School();//calling default 
sc.display();

School sc1 = new School("KVS");
sc1.display();

School sc2= new School("Orchids ", 2000);
sc2.display();
	}

}
