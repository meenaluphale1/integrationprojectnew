package com.lnt.appl.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lnt.appl.beans.Department;
import com.lnt.appl.exceptions.HrException;



@Repository
public class DeptDaoImpl implements DeptDao {
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public ArrayList<Department> getDeptList() throws HrException {
		String strQry = "from Dp";
		Query qry = manager.createQuery(strQry);
		List<Department> lst = qry.getResultList();		
		System.out.println(lst);
		return (ArrayList<Department>) lst;
	}
	
	@Override
	public boolean insertNewDept(Department dept) throws HrException {
		manager.persist(dept);
		return true;
	}

	@Override
	public ArrayList<Department> getDeptNos() throws HrException {
		String strQry = "select d.deptId from Dp d";
		Query qry = manager.createQuery(strQry);
		List<Department> lst = qry.getResultList();		
		System.out.println(lst);
		return (ArrayList<Department>) lst;
		
		
	}
	
	
}
/*
@Transactional(propagation=Propagation.REQUIRED)
@Override
public boolean insertNewDept(Department dept) throws HrException {
	manager.persist(dept);
	return true;
}
*/

/*
public ArrayList<Department> getDeptList() throws HrException;
*/