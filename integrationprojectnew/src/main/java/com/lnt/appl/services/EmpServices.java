package com.lnt.appl.services;

import java.util.ArrayList;
import java.util.List;

import com.lnt.appl.beans.Employee;

public interface EmpServices {
	
	public List<Employee> getEmpList() ;
	public Employee getEmpById(int empno) ;
	public int saveEmployee(Employee emp) ;
	public String updateEmployee(Employee emp);
	
}
