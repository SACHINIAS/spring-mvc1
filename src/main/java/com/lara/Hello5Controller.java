package com.lara;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello5Controller 
{
//	@RequestMapping(value="/hello5", method=RequestMethod.GET)
//	public String getData(ModelMap map)
//	{
//		System.out.println("i am from getData");
//		map.put("firstName", "Vijay");
//		map.put("age", 22);
//		map.put("email", "v@gmail.com");
//		return "success5.jsp";
//	}

//	@RequestMapping(value="/hello5", method=RequestMethod.GET)
//	public String getData(Map map)
//	{
//		System.out.println("i am from getData");
//		map.put("firstName", "Vijay");
//		map.put("age", 22);
//		map.put("email", "v@gmail.com");
//		return "success5.jsp";
//	}

	@RequestMapping(value="/hello5", method=RequestMethod.GET)
	public ModelAndView getData()
	{
		System.out.println("i am from getData");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("firstName", "Vijay");
		mav.addObject("age", 22);
		mav.addObject("email", "v@gmail.com");
		mav.setViewName("success5.jsp");
		
		return mav;
	}

}
