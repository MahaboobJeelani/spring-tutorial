package org.jsp.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfigarationBean {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.autowired");
		Batch b = context.getBean(Batch.class);
		System.out.println(b.getIds());
		System.out.println(b.getNames());
	}
}
