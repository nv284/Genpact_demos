package com.org.gen.day2;

public class Employee {

	String empName;
	int empID;
	int salary ;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(" Genpact is Welocoming all the employee !!!!! ");
	}
   
	public Employee(String empName, int empID, int salary) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.salary = salary;
	}
	void display() {
		System.out.println(" Employee name -> "+empName+ " Employee ID-> "+empID+" Salary -> "+ salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1 = new Employee();//defult 
Employee e2 = new Employee("Sunitha", 123, 45000);//paramitraize 
e2.display();
Employee e3 = new Employee("Ashok", 223, 34000);
e3.display();
Employee e4 = new Employee("Teena", 454, 40000);
e4.display();
	}

}
