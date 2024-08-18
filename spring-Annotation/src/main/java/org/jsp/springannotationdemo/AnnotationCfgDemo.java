package org.jsp.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationCfgDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Test.class);
		context.refresh();
		Test t = context.getBean(Test.class);
		t.test();
		t.test1();
	}
}
