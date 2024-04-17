package com.abs.herosofhappiness.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abs.herosofhappiness.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Employee findByEmail(String email);
	
}
