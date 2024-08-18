package org.jsp.springdemo;

public class Person {
	
	private int age;
	private String name;
	private String Address;
	private String city;
	
	public void display() {
		System.out.println("Age :" + age);
		System.out.println("Name :" + name);
		System.out.println("Address :" + Address);
		System.out.println("city :" + city);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
