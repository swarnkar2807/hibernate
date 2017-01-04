package annotation.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="con_emp")
@Table(name="contract_employee1")

@AttributeOverrides({
	@AttributeOverride(name="empId", column=@Column(name="emp_id")),
	@AttributeOverride(name="empName", column=@Column(name="emp_name")),
	@AttributeOverride(name="empDepartment", column=@Column(name="emp_department"))
})
public class ContractEmployee extends Employee{

	@Column(name="emp_pay_per_hour")
	private float empPayPerHour;
	@Column(name="emp_duration_in_month")
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
	
	

	
}
