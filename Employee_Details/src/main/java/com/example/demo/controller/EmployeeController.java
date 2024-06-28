package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.serviceimpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/Employee")
@CrossOrigin("http://localhost:3000")
public class EmployeeController {
	
	public EmployeeController(EmployeeServiceImpl service) {
		super();
		this.service = service;
	}

	EmployeeServiceImpl service;
	
	@PostMapping
	public String insertEmployee(@RequestBody Employee emp)
	{
		String msg="";
		try {
			service.addEmployee(emp);
			msg="Insertion Successful";
		} 
		
		catch(Exception e) {
			msg="Insertion Failure";
		}
		
		return msg;
	}

	@GetMapping("{id}")
	public Employee getEmployeeById(@PathVariable("id") int id)
	{
	return service.getEmployee(id);
	}

	@GetMapping("/all")
	public List<Employee> getEmployee ()
	{
	return service.getAllEmployee();
	}

	@PutMapping()
	public String updateEmployee(@RequestBody Employee emp)
	{
		String msg="";
		try {
			service.updateEmployee(emp);
			msg="Updation Success";
		} 	
		
		catch(Exception e) {
			msg="Updation Failure";
		}
		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteEmployeeById(@PathVariable("id") int id)
	{
		String msg="";
		try {
			service.deleteEmployee(id);
			msg="Deletion Success";
		} 
		
		catch(Exception e) {
			msg="Deletion Failure";
		}	

		return msg;

	}	
}
