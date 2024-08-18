package org.jsp.springlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String name;
	static {
		System.out.println("Student Class loaded into JVM Memeory");
	}
	public Student(){
		System.out.println("Student Instantiation");
	}

	public void destroy() throws Exception {
		System.out.println("Student Destroy");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Student Initaialization");
	}
}
