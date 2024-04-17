package com.abs.herosofhappiness.service;


import java.util.List;

import com.abs.herosofhappiness.entity.Admin;
import com.abs.herosofhappiness.entity.Employee;


public interface AdminService {
	public Admin createAdmin(Admin admin); 
	
	public Employee createEmployee(Employee employee);
	
	public String saveAdmin(Admin a);
	public int loginAdmin(String email,String password);
	public String sendMailForResetPassword(String email);
	public String resetpassword(String email,String password);

	public Admin getAdminByEmail(String email);

	public List<Employee> getAllEmployees();

	public String disableEmployee(String email);
}
