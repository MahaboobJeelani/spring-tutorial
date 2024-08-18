package org.jsp.springannotationbase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testcar {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.springannotationbase","org.btm.springannotationbase");
		Car c = context.getBean(Car.class);
		c.getE().start();
		}
}
