package org.jsp.springlifecycle;

public class Test {
	static {
		System.out.println("Test Class loaded into JVM Memory");
	}
	public Test() {
		System.out.println("Test Instansiation");
	}
	public void hii(){
		System.out.println("Test initialiazed");
	}
	public void byee(){
		System.out.println("Test Destroyed");
	}
}
