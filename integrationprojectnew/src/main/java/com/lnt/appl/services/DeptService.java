package com.lnt.appl.services;

import java.util.ArrayList;

import com.lnt.appl.beans.Department;
import com.lnt.appl.exceptions.HrException;



public interface DeptService
{
	public ArrayList<Department> getDeptList() throws HrException;
	public boolean createNewDepartment(Department dept) throws HrException;
	public ArrayList<Department> getDeptNos() throws HrException;
}
