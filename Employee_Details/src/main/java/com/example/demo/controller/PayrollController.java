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


import com.example.demo.model.Payroll;
import com.example.demo.serviceimpl.PayrollServiceImpl;

@RestController
@RequestMapping("/Payroll")
@CrossOrigin("http://localhost:3000")

public class PayrollController {
	
	public PayrollController(PayrollServiceImpl service) {
		super();
		this.service = service;
	}

	PayrollServiceImpl service;
	
	@PostMapping
	public String insertPayroll(@RequestBody Payroll pay)
	{
		String msg="";
		try {
			service.addPayroll(pay);
			msg="Insertion Success";
		} 
		
		catch(Exception e) {
			msg="Insertion Failure";
		}
		
		return msg;
	}

	@GetMapping("{id}")
	public Payroll getPayrollById(@PathVariable("id") int id)
	{
	return service.getPayroll(id);
	}

	@GetMapping("/all")
	public List<Payroll> getPayroll()
	{
	return service.getAllPayroll();
	}

	@PutMapping()
	public String updatePayroll(@RequestBody Payroll pay)
	{
		String msg="";
		try {
			service.updatePayroll(pay);
			msg="Updation Success";
		} 	
		
		catch(Exception e) {
			msg="Updation Failure";
		}
		
		return msg;
	}

	@DeleteMapping("{id}")
	public String deletePayrollById(@PathVariable("id") int id)
	{
		String msg="";
		try {
			service.deletePayroll(id);
			msg="Deletion Success";
		} 
		
		catch(Exception e) {
			msg="Deletion Failure";
		}	

		return msg;

	}	
}
