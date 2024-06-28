package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Payroll;
import com.example.demo.repository.PayrollRepo;
import com.example.demo.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService{
	
    public PayrollServiceImpl(PayrollRepo repo) {
		super();
		this.repo = repo;
	}
    PayrollRepo repo;
	
	@Override
	public void addPayroll(Payroll payroll) {
		repo.save(payroll);
	}
 
	@Override
	public Payroll getPayroll(int id) {
		
		return repo.findById(id).orElse(null);
	}
	
	@Override
	public List<Payroll> getAllPayroll(){
		return repo.findAll();
	}
 
	@Override
	public void updatePayroll(Payroll payroll) {
		repo.save(payroll);
	}	
	
	public void deletePayroll(int id) {
		repo.deleteById(id);
	}
	
}
