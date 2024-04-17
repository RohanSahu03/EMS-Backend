package com.abs.herosofhappiness.exception;

import lombok.Data;

@Data
public class EmpNotFoundException extends RuntimeException{
	private String entity;
	private String attribute;
	private String value;
	private String msg ="Employee not found with the given details";
	
	
	public EmpNotFoundException(String entity, String attribute, String value) {
		super();
		this.entity = entity;
		this.attribute = attribute;
		this.value = value;
	}
	public EmpNotFoundException(String email) {
		this.msg="No emplyee found with email : "+email;
	}
}
