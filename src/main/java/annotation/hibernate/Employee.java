package annotation.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name= "employee_hierarchy1")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employee {
	
	@Id
	@Column(name= "emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empId;
	@Column(name = "emp_name")
	String empName;
	@Column(name= "emp_department")
	String empDepartment;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + "]";
	}
}
