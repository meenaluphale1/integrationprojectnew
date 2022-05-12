package com.lnt.appl.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lnt.appl.beans.Department;
import com.lnt.appl.beans.Employee;

/*@Component is the most generic Spring annotation.  * 
 * A Java class decorated with @Component is found during classpath scanning 
 * and registered in the context as a Spring bean. ... 
 * @ComponentScan ensures that the classes decorated with
 *  @Component are found and registered as Spring beans.
 */
/*
 * @Component:
 * 		@Repository: It represents DAO Classes.
 * 		@Service:It represents Service classes.
 * 		@Cntroller: It represents Controller classes of Spring MVC
 * 		@RestController: It represents REST layer of Web Services.
 */
@Repository("empDao")
public class EmpDaoImpl implements EmpDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Employee> getEmpList()  {		
		//String sql = "SELECT e FROM empRec e";
		String sql = "SELECT e FROM Employee e"; //-- just to reduce display
		Query qry = entityManager.createQuery(sql);		
		List<Employee> empList = qry.getResultList();
		return empList;		
	}
	
	public Employee getEmpById(int empno)  {
		Employee emp = entityManager.find(Employee.class, empno);
	        if (emp == null) {
	            throw new EntityNotFoundException("Can't find Artist for ID " + empno);
	        }
	        return emp;
		
		//String sql = "SELECT e FROM empRec e where e.empno=?";
		//Query qry = entityManager.createQuery(sql);		
		//List<Employee> empList = qry.getResultList();
		//return empList;
		
	}
	@Transactional
	public Employee saveEmployee(Employee emp) {			
		entityManager.persist(emp);
		return emp;
	}
	
	
	
	
	@Override
	@Transactional
	public String updateEmployee(Employee emp)
	{
		
				entityManager.merge(emp);
		return "Record Updated";
	}

}
