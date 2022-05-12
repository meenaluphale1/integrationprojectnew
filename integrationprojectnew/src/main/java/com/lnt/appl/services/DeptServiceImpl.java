package com.lnt.appl.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.appl.beans.Department;
import com.lnt.appl.daos.DeptDao;
import com.lnt.appl.exceptions.HrException;



@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao dao;
	
	@Override
	public ArrayList<Department> getDeptList() throws HrException {
		return dao.getDeptList();
	}
	
	@Override
	public ArrayList<Department> getDeptNos() throws HrException {
		return dao.getDeptNos();
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public boolean createNewDepartment(Department dept) throws HrException {
		return dao.insertNewDept(dept);
	}
}

//Propagation defines our business logic �s transaction boundary.
//Spring manages to start and pause a transaction according to our propagation setting.


//@Transactional to wrap a method in a database transaction.(to all public methods not on private or protected methods )
//to set propagation, isolation, timeout, read-only, and rollback conditions for our transaction
//Spring creates a proxy or manipulates the class byte-code to manage the creation, commit, and rollback of the transaction.
/*
 * 
if we have a method like callMethod and we mark it as @Transactional, Spring would wrap some transaction management code around the invocation:@Transactional method called:

createTransactionIfNecessary();
try {
    callMethod();
    commitTransactionAfterReturning();
} catch (exception) {
    completeTransactionAfterThrowing();
    throw exception;
}*/

