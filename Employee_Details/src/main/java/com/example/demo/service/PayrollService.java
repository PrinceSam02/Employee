package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Payroll;

public interface PayrollService {
	public void addPayroll(Payroll payroll);
	public Payroll getPayroll(int id);
	public List<Payroll> getAllPayroll();
	public void updatePayroll(Payroll payroll);
	public void deletePayroll(int id);
}