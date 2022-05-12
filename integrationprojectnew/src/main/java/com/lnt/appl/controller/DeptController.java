
package com.lnt.appl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.appl.beans.Department;
import com.lnt.appl.exceptions.HrException;
import com.lnt.appl.services.DeptService;



@CrossOrigin(origins = "*")
@RestController  // @Controller +@ResponseBody 
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptService service;
	
	// http://localhost:8090/deptList
	
	@GetMapping(value="/departments", produces="application/json")
	public @ResponseBody  List<Department> getDeptList(){
		
		ArrayList<Department> deptList = null;
		
		try {
			deptList = service.getDeptList();
		} catch (HrException e) {
			e.printStackTrace();
		}
		
		return deptList;
	}	
	@GetMapping(value="/deptnos", produces="application/json")
	public @ResponseBody  List<Department> getDeptNos(){
		
		ArrayList<Department> deptList = null;
		
		try {
			deptList = service.getDeptNos();
		} catch (HrException e) {
			e.printStackTrace();
		}
		
		return deptList;
	}	
	
	@PostMapping(value="/addDept", consumes="application/json")
	public void getDeptList(@RequestBody Department dept){
		System.out.println(dept);
		try {
			boolean recInserted = service.createNewDepartment(dept);
			System.out.println(recInserted);
		} catch (HrException e) {
			e.printStackTrace();
		}
	}
}



//http://localhost:8090/SpringMVC130_REST/addDept
	/*
	 {
	    "deptId": 80,
	    "deptNm": "Administration",
	    "deptLoc": "Pune"
	}
	 */