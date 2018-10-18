package edu.hanoi.boot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "client/home/index";
	}
	
	@RequestMapping("/about")
	public String About() {
		
		return "client/user/about";
	}
	
	@RequestMapping("/company-page")
	public String Company_page() {
		
		return "client/user/company_page";
	}
	
	@RequestMapping("/contact")
	public String Contact() {
		
		return "client/user/contact";
	}
	
	@RequestMapping("/job-list")
	public String Joblist() {
		
		return "client/user/job_list";
	}
	

	@RequestMapping("/job-post")
	public String Jobpost() {
		
		return "client/user/job_post_2";
	}
	
	@RequestMapping("/login")
	public String Login() {
		
		return "client/user/login";
	}
	
	@RequestMapping("/register")
	public String Register() {
		
		return "client/user/register";
	}
	
}