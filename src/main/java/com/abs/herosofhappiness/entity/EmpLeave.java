package com.abs.herosofhappiness.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class EmpLeave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveid;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate startdate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate enddate;
	private String reason;
	private float duration;
	private int totalleave=50;
	private float remainleave;
	
	@OneToOne
	private Employee employee;
}
