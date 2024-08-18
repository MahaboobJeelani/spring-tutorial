package org.jsp.springlifecycle;

public class Demo {
	static {
		System.out.println("Demo Class loaded into JVM Memory");
	}
	public Demo() {
		System.out.println("Demo Instansiation");
	}
	public void hii(){
		System.out.println("Demo initialiazed");
	}
	public void byee(){
		System.out.println("Demo Destroyed");
	}

}
