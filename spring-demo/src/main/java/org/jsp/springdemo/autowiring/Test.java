package org.jsp.springdemo.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		Car c = context.getBean("myCar", Car.class);
		c.getEngine().start();
	}
}
