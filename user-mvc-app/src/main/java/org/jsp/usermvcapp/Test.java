package org.jsp.usermvcapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class Test {
	@ResponseBody
	@RequestMapping(value = "/test")
	public String testPersistence() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		return factory.toString();
	}
}
