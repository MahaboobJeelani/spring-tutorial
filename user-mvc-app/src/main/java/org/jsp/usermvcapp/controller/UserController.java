package org.jsp.usermvcapp.controller;

import org.jsp.usermvcapp.dao.UserDao;
import org.jsp.usermvcapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	private UserDao dao;

	@RequestMapping(value = "/open-register")
	public ModelAndView openRegister(ModelAndView modelAndView) {
		modelAndView.addObject("u", new User());
		modelAndView.setViewName("register");
		return modelAndView;
	}

	@ResponseBody
	@PostMapping(value = "/save")
	public String saveUser(@ModelAttribute(name = "u") User user) {
		user = dao.saveUser(user);
		return "user saved with id : " + user.getId();
	}

	@RequestMapping(value = "/open-update")
	public ModelAndView openUpdate(ModelAndView modelAndView) {
		modelAndView.addObject("u", new User());
		modelAndView.setViewName("update");
		return modelAndView;
	}

	@ResponseBody
	@PostMapping(value = "/update")
	public String UpdateUser(@ModelAttribute(name = "u") User user) {
		user = dao.updateUser(user);
		if (user != null)
			return "user with id : " + user.getId() + " is updated";
		return "Cannot Update User as id is Invalid";
	}
	
	@RequestMapping(value = "/open-view")
	public String openview(@RequestParam String view) {
		return view;
	}

	@RequestMapping("/verify-by-phone")
	public ModelAndView verifyUser(@RequestParam long phone, @RequestParam String password) {
		User u = dao.verifyUser(phone, password);
		ModelAndView modelAndView = new ModelAndView();
		if (u != null) {
			modelAndView.setViewName("print");
			modelAndView.addObject("u", u);
			return modelAndView;
		}
		modelAndView.setViewName("error");
		modelAndView.addObject("msg", "invalid phone and password");
		return modelAndView;
	}

	@GetMapping("/delete")
	public ModelAndView deleteUser(@RequestParam int id, ModelAndView modelAndView) {
		boolean deleted = dao.delete(id);
		if (deleted) {
			modelAndView.setViewName("error");
			modelAndView.addObject("msg", "user deleted");
			return modelAndView;
		}
		modelAndView.setViewName("error");
		modelAndView.addObject("msg", "cannot delete user as id is invalid");
		return modelAndView;
	}
}
