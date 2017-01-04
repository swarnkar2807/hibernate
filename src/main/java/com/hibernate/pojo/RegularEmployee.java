package com.hibernate.pojo;

public class RegularEmployee extends Employee{
	
	private float empSalary;
	private float empBonus;
	
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public float getEmpBonus() {
		return empBonus;
	}
	public void setEmpBonus(float empBonus) {
		this.empBonus = empBonus;
	}
	@Override
	public String toString() {
		return "RegularEmployee [empSalary=" + empSalary + ", empBonus=" + empBonus + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
