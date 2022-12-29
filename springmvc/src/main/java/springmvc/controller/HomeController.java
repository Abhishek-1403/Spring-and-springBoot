package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {	
		System.out.println("This is a home url");
		model.addAttribute("name","Abhishek gupta");
		return "hello";
	}
	
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","Abhishek Garg");
		modelAndView.addObject("rollno",12);
		modelAndView.addObject("status",true);
		LocalDateTime currTime=LocalDateTime.now(); 
		modelAndView.addObject("time",currTime);
		
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(156);
		list.add(77);
		list.add(188);
		list.add(199);
		
		modelAndView.addObject("marks",list);
		
		return modelAndView;
	}
	
	
}
