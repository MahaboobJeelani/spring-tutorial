package org.jsp.Springpra;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MusicSystemTest {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("spring-pra.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		MusicSystem m = factory.getBean("myCar");
		m.star();
	}
}
