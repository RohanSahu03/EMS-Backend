package com.abs.herosofhappiness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abs.herosofhappiness.entity.Admin;
import com.abs.herosofhappiness.entity.Employee;
import com.abs.herosofhappiness.service.AdminService;


@RestController
@CrossOrigin("http://localhost:3000")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/createadmin")
	public ResponseEntity<Object> createAdmin(@RequestBody Admin admin) {
		try {
		return ResponseEntity.status(HttpStatus.OK).body(adminService.createAdmin(admin));		
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	
	@PostMapping("/createemployee")
	public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
		return ResponseEntity.status(HttpStatus.OK).body(adminService.createEmployee(employee));
	}
	
	@GetMapping("/getAdmin")
	public ResponseEntity<Object> getAdmin(@RequestHeader String email){
		return ResponseEntity.status(HttpStatus.FOUND).body(adminService.getAdminByEmail(email));
	}
	
	@PostMapping("save")
	public ResponseEntity<String> adminSave(@RequestBody Admin a){
		return new ResponseEntity<String>(adminService.saveAdmin(a),HttpStatus.CREATED);
	}
	
	
	@GetMapping("login")
	public ResponseEntity<Integer> adminLogin(@RequestHeader String email,@RequestHeader String password){
		return new ResponseEntity<Integer>(adminService.loginAdmin(email, password),HttpStatus.OK);
	}
	
	
	@GetMapping("resetpasswordmail")
	public ResponseEntity<String> resetpasswordForMail(@RequestParam String email){
		return new ResponseEntity<String>(adminService.sendMailForResetPassword(email),HttpStatus.OK);
	}
	
	
	@PutMapping("resetpassword")
	public ResponseEntity<String> resetpassword(@RequestHeader String email,@RequestHeader String password){
		return new ResponseEntity<String>(adminService.resetpassword(email,password),HttpStatus.OK);
	}
	
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		return ResponseEntity.status(HttpStatus.OK).body(adminService.getAllEmployees());
	}
	
	@GetMapping("/inactiveEmployee")
	public ResponseEntity<String> disableEmployee(@RequestHeader String email) {
		return ResponseEntity.status(HttpStatus.OK).body(adminService.disableEmployee(email));
	}
}
