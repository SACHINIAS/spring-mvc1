package com.lara;

import org.springframework.web.multipart.MultipartFile;

public class Employee 
{
	private String firstName;
	private String lastName;
	private MultipartFile myFile;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMyFile(MultipartFile myFile) {
		this.myFile = myFile;
	}
	
	public MultipartFile getMyFile() {
		return myFile;
	}
	



}



