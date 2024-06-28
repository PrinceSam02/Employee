package com.example.demo.serviceimpl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
    public EmployeeServiceImpl(EmployeeRepo repo) {
		super();
		this.repo = repo;
	}

	EmployeeRepo repo;
	
	@Override
	public void addEmployee(Employee employee) {
		repo.save(employee);
	}
 
	@Override
	public Employee getEmployee(int id) {
		
		return repo.findById(id).orElse(null);
	}
	
	@Override
	public List<Employee> getAllEmployee(){
		return repo.findAll();
	}
 
	@Override
	public void updateEmployee(Employee employee) {
		repo.save(employee);
	}	
	
	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}
	
}
