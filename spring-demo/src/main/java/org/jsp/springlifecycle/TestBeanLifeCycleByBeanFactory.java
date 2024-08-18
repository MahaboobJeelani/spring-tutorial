package org.jsp.springlifecycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBeanLifeCycleByBeanFactory {
	public static void main(String[] args) {
		System.out.println("Testing Spring bean life cycle by bean factory");
		Resource r = new ClassPathResource("lifecycle.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		System.out.println(factory.getBean("student"));
		System.out.println(factory.getBean("student"));
		System.out.println(factory.getBean("student"));
		System.out.println(factory.getBean("student"));

	}
}
