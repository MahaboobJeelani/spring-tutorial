package org.jsp.jdbctemplate;

import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;



public class CreateUserTable {
//	Insert a record by JDBC Template
//	public static void main(String[] args) {
//		String sql = "create table user(id int not null,name varchar(45) not null,phone bigint(20) not null unique,password varchar(45) not null,primary key(id))";
//		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
////		template.execute(sql);
////		System.out.println("table created");
//		String qry = "insert into user Values(1,'xyz', 1238637, 'hdfjhvd9346')";
//		int r = template.update(qry);
//		System.out.println(r + " row Inserted");
//	}
	
//	code to execute a dynamic query by jdbc template
	
	public static void main(String[] args) {
		String qry = "insert into user values(?,?,?,?)";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user id , name, phone, password");
		int id = sc.nextInt();
		String name = sc.next();
		long phone = sc.nextLong();
		String password = sc.next();
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		int r = template.update(qry, id, name, phone, password);
		System.out.println(r  + "row inserted");
	}
}
