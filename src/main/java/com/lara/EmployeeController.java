package com.lara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController
{
	
	private EmployeeDAO employeeDao;
	
	@Autowired
	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	
	@RequestMapping(value="/addEmp", method=RequestMethod.GET)
	public ModelAndView getViewForAddEmployee()
	{
		Employee emp = new Employee();
		ModelAndView mav = new ModelAndView();
		mav.addObject("empForm", emp);
		mav.setViewName("emp");
		return mav;
	}
	
	@RequestMapping(value="/addEmp", method=RequestMethod.POST)
	public String processAddEmployee(@ModelAttribute("empForm") Employee emp) 
		throws Exception
	{
		String firstName = emp.getFirstName();
		String lastName = emp.getLastName();
		MultipartFile myFile = emp.getMyFile();
		byte[] allBytes = myFile.getBytes();
		System.out.println("First Name:" + firstName);
		System.out.println("Last Name:" + lastName);
		System.out.println(myFile.getOriginalFilename() + ":" + allBytes.length);
		employeeDao.saveEmployee(emp);
		return "empAddSuccess";
 	}
	
}
