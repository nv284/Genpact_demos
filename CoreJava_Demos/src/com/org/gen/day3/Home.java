package com.org.gen.day3;

//SAM / functional 

@FunctionalInterface
public interface Home {
void HomeLoan(); //single abstract method 

static int calLoan(int p , int r , int t ) {
	int si = (p*r*t/100);
	return si;
}

default void m2() {
	System.out.println(" Pay the loan at given time line ");
}

default void type_of_home() {
	System.out.println(" Decalre the type of Home size");
}
}
