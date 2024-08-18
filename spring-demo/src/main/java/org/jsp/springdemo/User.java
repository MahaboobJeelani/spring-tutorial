package org.jsp.springdemo;

public class User {
	
	private String name;
	private long phone;

	public void display() {
		System.out.println("Name :" + name);
		System.out.println("Phone :" + phone);
	}

	public User() {
	}

	public User(String name, long phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
}
