package org.jsp.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCar1 {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("car-system.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Car1  c= factory.getBean("yourCar", Car1.class);
		c.getMusicSystem().play();
		
//		Car1 c1 = factory.getBean("myCar", Car1.class);
//		c1.getMusicSystem().play();
		
	}
}
