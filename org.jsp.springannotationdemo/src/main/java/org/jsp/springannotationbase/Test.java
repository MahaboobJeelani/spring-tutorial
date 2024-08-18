package org.jsp.springannotationbase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.springannotationbase");
		Person p = context.getBean("person", Person.class);
		p.display();
	}
}
