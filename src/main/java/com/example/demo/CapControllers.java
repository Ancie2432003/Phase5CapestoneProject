package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CapControllers {
	Logger log=Logger.getAnonymousLogger();
@Autowired
CapRepo repo;
@RequestMapping("/")
@PostMapping("/")
public ModelAndView defaultpage(HttpServletRequest request,HttpServletResponse response, User user) {
	log.info("entered into the / request");
	ModelAndView mv=new ModelAndView();	
	mv.setViewName("Hey "+user.getName()+" your now in Home page");
	log.info("went to home page ");
	return mv;
	
}
//login
@RequestMapping("/login")
@PostMapping("/login")
public ModelAndView loginpage(HttpServletRequest request,HttpServletResponse response,User user) {
	log.info("entered into the /login request");
	ModelAndView mv=new ModelAndView();	
	mv.setViewName("Hey "+user.getName()+" you logged in successfully  ");
	log.info("went to login page ");
	return mv;
	
}
//register
@RequestMapping("/register")
@PostMapping("/register")
public ModelAndView registerpage(HttpServletRequest request,HttpServletResponse response,User user) {
	log.info("entered into the /register request");
	ModelAndView mv=new ModelAndView();	
	mv.setViewName("Hey "+user.getName()+" you have Registered in successfully  ");
	log.info("went to register page ");
	return mv;
	
}

//payment amount
@RequestMapping("/payment")
@PostMapping("/payment")
public ModelAndView paymentpage(HttpServletRequest request,HttpServletResponse response, User user) {
	log.info("entered into the /payment request");
	ModelAndView mv=new ModelAndView();	
	mv.setViewName("Hey "+user.getName()+" your payment is successfully done ");
	log.info("went to payment page ");
	return mv;
	}
//cart module
@RequestMapping("/cart")
@PostMapping("/cart")
public ModelAndView cartpage(HttpServletRequest request,HttpServletResponse response, User user) {
	log.info("entered into the /cart request");
	ModelAndView mv=new ModelAndView();	
	mv.setViewName("Hey "+user.getName()+" your cart is added successfully ");
	log.info("went to cart page ");
	return mv;
	}
//Order View Module all items
@RequestMapping("/view")
@PostMapping("/view")
public ModelAndView viewpage(HttpServletRequest request,HttpServletResponse response, User user) {
	log.info("entered into the /view request");
	ModelAndView mv=new ModelAndView();	
	mv.setViewName("Hey "+user.getName()+". ");
	log.info("went to view page ");
	return mv;
	}
//contactModule
@RequestMapping("/contact")
@PostMapping("/contact")
public ModelAndView contactpage(HttpServletRequest request,HttpServletResponse response, User user) {
	log.info("entered into the /contact request");
	ModelAndView mv=new ModelAndView();	
	mv.setViewName("Hey "+user.getName()+" this Contact page. ");
	log.info("went to contact page ");
	return mv;
	}
//aboutModule
@RequestMapping("/about")
@PostMapping("/about")
public ModelAndView aboutpage(HttpServletRequest request,HttpServletResponse response, User user) {
	log.info("entered into the /about request");
	ModelAndView mv=new ModelAndView();	
	mv.setViewName("Hey "+user.getName()+"this is About Page. ");
	log.info("went to about page ");
	return mv;
	}
//LogoutModule
@RequestMapping("/logout")
@PostMapping("/logout")
public ModelAndView logoutpage(HttpServletRequest request,HttpServletResponse response, User user) {
	log.info("entered into the /logout request");
	ModelAndView mv=new ModelAndView();	
	mv.setViewName("Hey "+user.getName()+" this page Logged out Successfully. ");
	log.info("went to logout page ");
	return mv;
	}
}
