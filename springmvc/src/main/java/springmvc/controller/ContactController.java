package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String useremail,
			@RequestParam("username") String username,
			@RequestParam("password") String userPassword,
			Model model) {
		System.out.println("User email "+useremail);
		System.out.println("User name "+username);
		System.out.println("User password "+userPassword);
		
		//process
		
		model.addAttribute("name",username);
		model.addAttribute("password",userPassword);
		model.addAttribute("email",useremail);
		
		return "sucess";
	}
	
	
	//	old way for fetch the values from view..
	/*
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
	 * handleForm(HttpServletRequest request) { String email =
	 * request.getParameter("email"); System.out.println("User email is "+email);
	 * return ""; }
	 */
}
 