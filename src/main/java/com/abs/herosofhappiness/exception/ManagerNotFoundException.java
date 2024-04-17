package com.abs.herosofhappiness.exception;

import lombok.Data;

@Data
public class ManagerNotFoundException extends RuntimeException {
	private String entity;
	private String attribute;
	private String value;
	private String msg ="Manager not found with the given details";
	
	
	public ManagerNotFoundException(String entity, String attribute, String value) {
		super();
		this.entity = entity;
		this.attribute = attribute;
		this.value = value;
		
	}
}
