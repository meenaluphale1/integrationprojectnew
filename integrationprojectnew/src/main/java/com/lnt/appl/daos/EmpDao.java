package com.lnt.appl.daos;


import java.util.List;

import com.lnt.appl.beans.Employee;
public interface EmpDao
{
	public List<Employee> getEmpList() ; 	
	public Employee getEmpById(int empno) ;
	public Employee saveEmployee(Employee emp) ;
	public String updateEmployee(Employee emp);
	
}
