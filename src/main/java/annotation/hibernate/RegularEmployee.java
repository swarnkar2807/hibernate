package annotation.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="reg_emp")
@Table(name="regular_employee1")
@AttributeOverrides({
	@AttributeOverride(name="empId", column=@Column(name="emp_id")),
	@AttributeOverride(name="empName", column=@Column(name="emp_name")),
	@AttributeOverride(name="empDepartment", column=@Column(name="emp_department"))
})
public class RegularEmployee extends Employee{
	
	@Column(name="emp_salary")
	private float empSalary;
	@Column(name="emp_bonus")
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
	
	
	
}
