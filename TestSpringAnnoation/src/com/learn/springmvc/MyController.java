package com.learn.springmvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class MyController {
	@RequestMapping("/{page}")
	public ModelAndView modelCreaterA(@PathVariable("page") String name){
		
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("Msg", "Annotation based Spring MVC application i made "+name);
		
		return modelandview;
	}
	@RequestMapping("/book/{pagenumber}/{linenumber}")
	public ModelAndView modelCreaterB(@PathVariable Map<String, String> pathName){
	
		String pageNumber = pathName.get("pagenumber");
		String lineNumber = pathName.get("linenumber");
		
		ModelAndView modelandview = new ModelAndView("HelloPage2");
		modelandview.addObject("Msg", "you are inside OAC book PAGEUMBER "+pageNumber+" "+lineNumber);
		
		return modelandview;
	}
}
