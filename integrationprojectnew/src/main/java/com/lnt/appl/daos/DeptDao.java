package com.lnt.appl.daos;

import java.util.ArrayList;

import com.lnt.appl.beans.Department;
import com.lnt.appl.exceptions.HrException;


public interface DeptDao {
	
	public ArrayList<Department> getDeptList() throws HrException;
	public ArrayList<Department> getDeptNos() throws HrException;
	
	public boolean insertNewDept(Department d) throws HrException;
}
