package com.contact;

public class contact {

	private int contactid;
	private String name;
	private String email;
	private String message;
	
	
	public contact(int contactid, String name, String email, String message) {
		
		this.contactid = contactid;
		this.name = name;
		this.email = email;
		this.message = message;
	}


	public int getContactid() {
		return contactid;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getMessage() {
		return message;
	}


	
	
}
