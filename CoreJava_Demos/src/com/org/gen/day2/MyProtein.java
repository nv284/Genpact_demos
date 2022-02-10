package com.org.gen.day2;
class Proteins { 
Proteins() 
{ 
  System.out.println("Protein is one of the basic building blocks of the Human body. "); 
  System.out.println("Hair, Skin, Eyes, Muscles, and organs are all made up of Protein"); 
 } 
}
 class Source extends Proteins 
{ 
Source() 
{ 
  this(1); 
  System.out.println("Source of Proteins are milk, eggs, meat, pulses, soybeans"); 
} 
Source(int s) 
{ 
  // Here, we have not placed super() keyword. 
 // JVM will automatically put the super() keyword and call superclass constructor. 
  System.out.println("Proteins are made up of amino acids"); 
 }
}
public class MyProtein {
	public static void main(String[] args) 
	{ 
	  Source sc = new Source(); 
	 } 
}
