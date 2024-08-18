package org.jsp.springannotationbase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component (value = "person")
public class Person {
//	@Value (value = "BAC")
	private String name;
//	@Value (value = "0987654321")
	private long phone;
//	@Value (value = "23")
	private int age;
	
	
	
	public Person(@Value(value="XZY") String name, @Value(value="0987654321")long phone, @Value(value="23")int age) {
	super();
	this.name = name;
	this.phone = phone;
	this.age = age;
}
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age: "+age);
		System.out.println("Phone:"+phone);
	}
	public String getName() {
		return name;
	}
//	@Value (value ="ABC")
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
//	@Value (value ="0987654321")
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
//	@Value (value ="23")
	public void setAge(int age) {
		this.age = age;
	}
	

}
