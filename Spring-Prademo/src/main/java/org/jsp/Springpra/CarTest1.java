package org.jsp.Springpra;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//Spring bean initialization by XML using beanFactory
public class CarTest1 {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("spring-pra.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Car c = factory.getBean("myCar", Car.class);
		c.start();
	}
}
