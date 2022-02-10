package com.org.gen.day3;

class MotherBoard{
	String model;
	public MotherBoard(String model) {
		super();
		this.model = model;
	}


	static class USB{
		int usb2 = 2 ;
		int usb3 = 1 ; 
		int getTotalPorts() {
		
			return usb2+usb3;}
		}
	}


public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MotherBoard.USB usb = new MotherBoard.USB();
   System.out.println(" Total Ports = "+ usb.getTotalPorts());
	}

}
