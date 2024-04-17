package com.abs.herosofhappiness.service;

import java.util.List;

import com.abs.herosofhappiness.entity.Employee;


public interface ManagerService {
	public int loginManager(String email,String password);
	public String sendMailForResetPassword(String email);
	public String resetPassword(String email,String password);
	public List<Employee> findEmpByMgrId(String email);

}
