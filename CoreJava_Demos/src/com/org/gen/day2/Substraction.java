package com.org.gen.day2;

public class Substraction {
	// no of parameter is diffrent 
	  void sum(int a, int b) 
	   { 
	     int s = a + b; 
	     System.out.println("Sum of two numbers: " +s); 
	   } 
	  void sum(int a, int b, int c) 
	   { 
	     int t = a + b + c; 
	     System.out.println("Sum of three numbers: " +t); 
	   } 
	  //datatype is diff
int sub(int x , int y ) {
	int a = x-y;
	System.out.println(" Substration of two number : "+a );
	return a ;
			
}
double sub(double x, double y) 
{ 
  double b = x - y; 
  System.out.println("Subtraction of two numbers: " +b); 
  return b; 
} 

//change the sequence 
void multiply(int a , double b) {
	double m1 = a*b;
	System.out.println("Multiplication = "+m1);
}
void multiply(double a , int b ) {
	double m2 = a*b;
	System.out.println(" multiplication m2 = "+m2);
}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Substraction s = new Substraction(); 
		    s.sub(6, 5); // It will call the method sub() to calculate the subtraction of two int type arguments. 
		    s.sub(20.8, 10.9); // It will call the method sub() to calculate the subtraction of two double type arguments. 
		    s.sum(10, 20);s.sum(100, 200, 250);
	}

}
