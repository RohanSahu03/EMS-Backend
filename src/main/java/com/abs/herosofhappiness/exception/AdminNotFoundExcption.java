package com.abs.herosofhappiness.exception;

import lombok.Data;

@Data
public class AdminNotFoundExcption  extends RuntimeException{
	private String entity;
	private String attribute;
	private String value;
	private String msg ="Admin not found with the given details";
	
	
	public AdminNotFoundExcption(String entity, String attribute, String value) {
		super();
		this.entity = entity;
		this.attribute = attribute;
		this.value = value;
	}
}
