package com.abs.herosofhappiness.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abs.herosofhappiness.entity.EmpLeave;


public interface EmpLeaveRepo extends JpaRepository<EmpLeave, Integer> {

	@Query(nativeQuery = true,value  ="select * from emp_leave e where e.employee_empid=?1")
	EmpLeave findByEmpId(int empid);
	//emp_leave

}
