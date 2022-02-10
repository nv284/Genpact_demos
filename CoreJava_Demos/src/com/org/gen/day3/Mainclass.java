package com.org.gen.day3;

abstract class Identity 
{ 
  abstract void getName(String name); 
  abstract void getGender(String gender); 
  abstract void getCity(String city); 
} 
class Person extends Identity{

	@Override
	void getName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name :"+name);
	}

	@Override
	void getGender(String gender) {
		// TODO Auto-generated method stub
		System.out.println("Gender : "+gender);
	}

	@Override
	void getCity(String city) {
		// TODO Auto-generated method stub
		System.out.println("City : "+city);
	}
	void getCountry(String country) {
		System.out.println("Country : "+country);
	}
	
}
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Identity i = new Person();
i.getName("Nishi");i.getCity("Mumbai");i.getGender("F");

	}

}
