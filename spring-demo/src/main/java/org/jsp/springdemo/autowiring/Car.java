package org.jsp.springdemo.autowiring;

public class Car {
	private Engine engine;
	
	public Car() {
		System.out.println("Car() Called");
	}
	public Car(Engine engine) {
		System.out.println("car(engine Called");
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
