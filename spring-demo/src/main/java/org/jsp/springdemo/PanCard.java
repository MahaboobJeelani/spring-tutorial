package org.jsp.springdemo;

public class PanCard {
	
	private String number;
	private int pincode;
	
	public void display() {
		System.out.println("Number " + number);
		System.out.println("Pincode "+ pincode);
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
