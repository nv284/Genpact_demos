package com.org.gen.day2;

class Data{
	String name ; int rollno ; int marks;
	public Data(String name) {
		super();
		this.name = name;
		System.out.println(" Student data");
	}
	public Data(int rollno) {
		super();
		this.rollno = rollno;
		System.out.println(" roll no ");
	}
	public Data(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	void display() {
		System.out.println(" School name - "+ name + "  Roll no - "+ rollno + " Marks - "+ marks);
	}
	
}

public class ConstChaining  extends Data {

	ConstChaining(){
		super("Shubh", 101, 400);
		
	}
ConstChaining(String scname){
	this();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstChaining c = new ConstChaining("KVS");
c.display();
	}

}
