package org.jsp.springlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCycleByApplicationContext {
	public static void main(String[] args) {
		System.out.println("Testing Sping bean life cycle by application context");
		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		System.out.println(context.getBean("student"));
		System.out.println(context.getBean("student"));
		System.out.println(context.getBean("student"));
		System.out.println(context.getBean("student"));
	}
}
