package org.jsp.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson1 {
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("person-card.xml");
		Person1 p = context.getBean("person1", Person1.class);
		p.getCard().display();
		
		Person1 p2 = context.getBean("person2", Person1.class);
		p2.getCard().display();
	}
}
