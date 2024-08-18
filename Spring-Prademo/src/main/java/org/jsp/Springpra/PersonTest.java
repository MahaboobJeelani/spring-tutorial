package org.jsp.Springpra;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//Spring bean initialization by XML using Setter
public class PersonTest {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("spring-pra.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Person p = factory.getBean("person", Person.class);
		p.details();
	}
}
