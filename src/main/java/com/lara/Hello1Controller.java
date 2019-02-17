package com.lara;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hello1Controller
{
	@RequestMapping(value="/hello1", method=RequestMethod.GET)
	public String sayHello1()
	{
		System.out.println("from spring controller");
		return "success1.jsp";
	}
	@RequestMapping(value="/hello2", method=RequestMethod.GET)
	public String getHello2()
	{
		System.out.println("from spring getHello2");
		return "success2.jsp";
	}
	
	@RequestMapping(value="/hello3", method=RequestMethod.POST)
	public String processHello3(HttpServletRequest request)
	{
		String s1 = request.getParameter("firstName");
		System.out.println("from spring processHello3:" + s1);
		return "success3.jsp";
	}

	@RequestMapping(value="/hello4", method=RequestMethod.GET)
	public String processHello4(HttpServletResponse response)
	{
		response.setIntHeader("refresh", 5);
		System.out.println("from spring processHello4:");
		return "success4.jsp";
	}	
}




