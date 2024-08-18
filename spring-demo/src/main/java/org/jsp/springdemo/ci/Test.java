package org.jsp.springdemo.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dept.xml");
		Department d = context.getBean("dept", Department.class);
		System.out.println("Names :" + d.getNames());
		System.out.println("Ids :" + d.getIds());
		System.out.println("Details : " + d.getDetails());
	}
}
