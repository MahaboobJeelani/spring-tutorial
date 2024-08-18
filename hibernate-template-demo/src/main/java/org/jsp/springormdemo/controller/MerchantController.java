package org.jsp.springormdemo.controller;

import java.util.Scanner;

import org.jsp.springormdemo.dao.MerchantDao;
import org.jsp.springormdemo.dto.Merchant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MerchantController {
	private static MerchantDao dao;
	private static Scanner sc = new Scanner(System.in);
	static {
		ApplicationContext context = new ClassPathXmlApplicationContext("hib-template.xml");
		dao = context.getBean(MerchantDao.class);
	}

	public static void main(String[] args) {
		System.out.println("1. save Merchant");
		System.out.println("2. update merchant");
		System.out.println("3. find merchant by id");
		System.out.println("4.. delete merchant by id");
		System.out.println("============================================");

		switch (sc.nextInt()) {
		case 1: {
			save();
			break;
		}
		case 2: {
			update();
			break;
		}
		case 3: {
			findById();
			break;
		}
		case 4: {
			delete();
			break;
		}
		default: {
			System.out.println("Invalid Choice");
		}
		}
	}

	public static void save() {
		System.out.println("Enter the name, phone, email, gst-no and password to save user");
		Merchant m = new Merchant();
		m.setName(sc.next());
		m.setPhone(sc.nextLong());
		m.setEmail(sc.next());
		m.setGst_number(sc.next());
		m.setPassword(sc.next());
		m = dao.saveMerchant(m);
		System.out.println("User register with id:" + m.getId());
	}

	public static void update() {
		System.out.println("Enter the merchant Id to update");
		int id = sc.nextInt();
		System.out.println("Enter the name,phone email , gst-no and password to save user");
		Merchant m = new Merchant();
		m.setId(id);
		m.setName(sc.next());
		m.setPhone(sc.nextLong());
		m.setEmail(sc.next());
		m.setGst_number(sc.next());
		m.setPassword(sc.next());
		m = dao.updateMerchant(m);
		if (m != null)
			System.out.println("Merchant updated");
		else
			System.err.println("cannot update merchant as the entered id is Invalid");
	}

	public static void findById() {
		System.out.println("Enter the Merchant id to print details");
		int id = sc.nextInt();
		Merchant m = dao.findbyid(id);
		if (m != null) {
			System.out.println("=============================");
			System.out.println("User Id:" + m.getId());
			System.out.println("User Name:" + m.getId());
			System.out.println("Phone Number:" + m.getPhone());
			System.out.println("gst_number :" + m.getGst_number());
			System.out.println("Email Id:" + m.getEmail());
		} else {
			System.err.println("You have entered an Invalid Id");
		}
	}

	public static void delete() {
		System.out.println("Enter the merchant Id to delete");
		int id = sc.nextInt();
		boolean deleted = dao.deletebyid(id);
		if (deleted) {
			System.out.println("merchant deleted");
		} else {
			System.err.println("Cannot delete merchant as Entered Id is Invalid");
		}
	}
}
