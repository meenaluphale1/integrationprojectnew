
package com.lnt.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.appl.beans.Employee;
import com.lnt.appl.daos.EmpDao;


@Service("empService")  
public class EmpServicesImpl implements EmpServices {
	
	@Autowired  // By Type injection.
	private EmpDao empDao;
	
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	
	public int saveEmployee(Employee emp) {
		empDao.saveEmployee(emp);
		return 0;
	}

	public List<Employee> getEmpList(){
		return empDao.getEmpList();
	}

	public Employee getEmpById(int empno)	{
		
		return empDao.getEmpById(empno);
	}

	@Override
	public String updateEmployee(Employee emp) {

		String  msg=empDao.updateEmployee(emp);
		return msg;
	}

	
}
