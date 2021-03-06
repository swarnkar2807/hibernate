package com.hibernate.pojo;

public class ContractEmployee extends Employee{

	private float empPayPerHour;
	private int empDurationInMonth;
	
	public float getEmpPayPerHour() {
		return empPayPerHour;
	}
	public void setEmpPayPerHour(float empPayPerHour) {
		this.empPayPerHour = empPayPerHour;
	}
	public int getEmpDurationInMonth() {
		return empDurationInMonth;
	}
	public void setEmpDurationInMonth(int empDurationInMonth) {
		this.empDurationInMonth = empDurationInMonth;
	}
	@Override
	public String toString() {
		return "ContractEmployee [empPayPerHour=" + empPayPerHour + ", empDurationInMonth=" + empDurationInMonth
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
