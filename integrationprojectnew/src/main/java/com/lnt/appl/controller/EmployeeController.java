

package com.lnt.appl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.appl.beans.Department;
import com.lnt.appl.beans.Employee;
import com.lnt.appl.services.EmpServicesImpl;



@CrossOrigin(origins = "*") // any url, any, port no, any server
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmpServicesImpl employeeService;

//http://localhost:8090/emp/employees
	@GetMapping("/employees")
	public List<Employee> getEmpList() {
		System.out.println("inside controller");
	
		return employeeService.getEmpList();
	}		
	//http://localhost:8090/emp/employee/102
	
	@GetMapping("/employee/{id}")
	public Employee getEmpDetails(@PathVariable(value = "id") int id) {
		
		System.out.println("controller "+id);
		System.out.println(employeeService.getEmpById(id));
		return employeeService.getEmpById(id);
	}
	
	//http://localhost:8090/emp/updateEmp
	
	@PutMapping("/updateEmp")
	public String updateProduct(@RequestBody Employee e)
	{
		String msg=employeeService.updateEmployee(e);
		return msg;
	}
	
	//http://localhost:8090/emp/addemp
	
	  @PostMapping("/addemp") 
	  public int saveEmployee(@RequestBody Employee emp)
	  { 
		System.out.println(emp);
	   employeeService.saveEmployee(emp);
	  return emp.getEmpNo(); 
	  }
//	 http://localhost:8090/emp/addemp1/20
	 
	  @PostMapping("/addemp1/{did}") 
	  public int saveEmployee1(@PathVariable(value = "did") int did,@RequestBody Employee emp)
	  { 
		System.out.println(" controller" +emp +"did" +did);
		  Department d= new Department();
		  d.setDeptId(did);
		  emp.setDepartment(d);
		System.out.println(emp);
	   employeeService.saveEmployee(emp);
	  return emp.getEmpNo(); 
	  }
	 
	
}