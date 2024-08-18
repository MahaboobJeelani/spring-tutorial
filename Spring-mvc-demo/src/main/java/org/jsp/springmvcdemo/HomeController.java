//package org.jsp.springmvcdemo;
//
//import org.jsp.springmvcdemo.model.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class HomeController {
//	@RequestMapping(value = "/open-home")
//	public String home(Model model) {
//		model.addAttribute("user", "virat");
//		return "home";
//	}
//	@RequestMapping("/open-register")
//	public ModelAndView openRegister() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("register");
//		modelAndView.addObject("u", new User());
//		return modelAndView;
//	}
//	
//	@PostMapping(value = "/register")
//	public ModelAndView displayDetails(@ModelAttribute(name = ('u') User user) {
//		System.out.println("ID :" + user.getId());
//		System.out.println("Name : " + user.getName());
//		System.out.println("Email :" + user.getEmail());
//		System.out.println("Phone : " + user.getPhone());
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("print");
//		modelAndView.addObject("result", "User Data Has been printed");
//		return ModelAndView;
//	}
//}

package org.jsp.springmvcdemo;

import org.jsp.springmvcdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = "/open-home")
    public String home(Model model) {
        model.addAttribute("user", "virat");
        return "home";
    }

    @RequestMapping("/open-register")
    public ModelAndView openRegister() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        modelAndView.addObject("u", new User());
        return modelAndView;
    }

    @PostMapping(value = "/register")
    public ModelAndView displayDetails(@ModelAttribute("u") User user) {
        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone: " + user.getPhone());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("print");
        modelAndView.addObject("result", "User Data Has been printed");
        return modelAndView;
    }
}

