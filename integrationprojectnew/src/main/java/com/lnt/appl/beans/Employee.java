
package com.lnt.appl.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="EmpSpring")
public class Employee {
	
	@Id
	@Column(name="empNo")
	private int empNo;

	@Column(name="eName")
	private String empName;
	
	@Column(name="sal")
	private long empSal;	
	
	@ManyToOne
	@JoinColumn(name="DEPTNO")
	Department department;

	public Employee(int empNo, String empName, long empSal, Department department) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.department = department;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpSal() {
		return empSal;
	}

	public void setEmpSal(long empSal) {
		this.empSal = empSal;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", department=" + department
				+ "]";
	}
	
	
	
	
}
