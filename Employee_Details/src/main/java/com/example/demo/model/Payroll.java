package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Payroll_tbl")
public class Payroll {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="hra")
	private int hra;
	@Column(name="da")
	private int da;
	@Column(name="ta")
	private int ta;
	@Column(name="pf")
	private int pf;
	@Column(name="basicPay")
	private int basicPay;
	private int ctc;
	
	public Payroll() {
		super();
	}
	
	public Payroll(int id, int hra, int da, int ta, int pf, int basicPay, int ctc) {
		super();
		this.id = id;
		this.hra = hra;
		this.da = da;
		this.ta = ta;
		this.pf = pf;
		this.basicPay = basicPay;
		this.ctc = ctc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public int getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}
	public int getCtc() {
		return ctc;
	}
	public void setCtc(int ctc) {
		this.ctc = ctc;
	}
	@Override
	public String toString() {
		return "Payroll [id=" + id + ", hra=" + hra + ", da=" + da + ", ta=" + ta + ", pf=" + pf + ", basicPay="
				+ basicPay + ", ctc=" + ctc + "]";
	}
	
	
	
	
	
	

}
