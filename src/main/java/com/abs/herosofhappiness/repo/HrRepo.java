package com.abs.herosofhappiness.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abs.herosofhappiness.entity.Employee;

@Repository
public interface HrRepo extends JpaRepository<Employee, Integer> {
	public Employee findByEmail(String email);
	@Query("select  e from Employee e where hid=?1")
	 List<Employee> findByHr_id(int hr_id);
}
