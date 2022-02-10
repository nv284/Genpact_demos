package com.org.gen.day2;

public class EmpInfo {
int id ; String name ; 
Address address; //an object of one class is created as a data member inside another class 
VInfo vinfo;
//static String Company_Name = "genpact";

	public EmpInfo(int id, String name, Address address, VInfo vinfo) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.vinfo = vinfo;
}
void display() {
	System.out.println(id+"    "+name);
	System.out.println(address.city+"   "+address.state+"   "+address.house_no+"    "+address.pin);
	System.out.println(vinfo.vname+"   "+vinfo.vname+"   "+vinfo.model);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address a1 = new Address("Mumbai", "Maharashtra", 111,12345);

VInfo v = new VInfo("Acitva", "VX", "mh120887");

EmpInfo e = new EmpInfo(123, "Shekhar", a1, v);
e.display();
	}

}
