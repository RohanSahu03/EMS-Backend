package com.abs.herosofhappiness.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abs.herosofhappiness.entity.Employee;


@Repository
public interface ManagerRepo extends JpaRepository<Employee, Integer> {
	public Employee findByEmail(String email);
	@Query("select  e from Employee e where mid=?1")
	public List<Employee> findByMgrId(int mgrid);
}
