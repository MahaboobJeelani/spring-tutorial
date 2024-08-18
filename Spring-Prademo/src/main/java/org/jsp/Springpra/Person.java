package org.jsp.Springpra;
//Spring bean initialization by XML using Setter
public class Person {
	private String name;
	private int id;
	
	public Person() {
	}
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void details() {
		System.out.println("Name : " + name);
		System.out.println("id : "+ id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
