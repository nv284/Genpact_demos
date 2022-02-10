package com.org.gen.day1;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cities[] = {"Dhanbad" ,"Mumbai" , "Delhi","NewYork"};

System.out.println(" Name of cities");
for(String c : cities) {
	System.out.println(c);
}

int sums[] = {1,2,3,4,5,6,7,8,9};
int n = 0 ;
for(int x :sums) {
	n=n+x;
	if(x==5)
		break;
}
System.out.println(" Sum : "+ n);
	}

}
