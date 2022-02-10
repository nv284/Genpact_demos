package com.org.gen.day3;

public class Loan implements Home, Education, Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l = new Loan();
		l.HomeLoan();l.carLoan();l.eduLoan();l.m2();
		Home h = new Loan();
	int home = Home.calLoan(20000, 9, 10);
	System.out.println(" Simple int on home loan is --> "+home);

	}

	@Override
	public void carLoan() {
		// TODO Auto-generated method stub
		System.out.println(" rate of int on Car loan is 7.5%");
	}

	@Override
	public void eduLoan() {
		// TODO Auto-generated method stub
		System.out.println(" rate of int on Education loan 3.5% ");
	}

	@Override
	public void HomeLoan() {
		// TODO Auto-generated method stub
		System.out.println(" Rate of intrest on Home loan is 8.9%");
	}

}
