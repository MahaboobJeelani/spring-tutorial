package org.jsp.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.autowiring");
		Baby b = context.getBean(Baby.class);
		b.getIceCream().eat();
	}
}
