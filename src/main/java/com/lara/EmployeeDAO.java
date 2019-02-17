package com.lara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO
{
	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) 
	{
		this.template = template;
	}
	
	public void saveEmployee(Employee emp) throws Exception
	{
		String sql = "INSERT INTO EMPLOYEE VALUES(?, ?, ?)";
		Object[] data = { emp.getFirstName(),
						  emp.getLastName(),
						  emp.getMyFile().getBytes()};
		template.update(sql, data);
		System.out.println("saved successfully in the db");
	}
}
