package com.lnt.appl.user;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


public class JpqlQueries {
	
	public static void main(String[] args) {
		
	//	EntityManager em=DbUtil.getEntityManager();
		
		//em.getTransaction().begin();
		
		//Employee e1=em.find(Employee.class, 102);
		//System.out.println(e1);
		
		//em.getTransaction().commit();
		// JPQL - 
		
		//Ex1  : 
		
	/*	Query qry=em.createQuery("Select e from Employee e ");
		List<Employee> empList =qry.getResultList();
		
		for(Employee e:empList)
		{
			System.out.println(e.getEname() + "  " + e.getSalary()) ;
		}
		*/
		
		
		//Ex2 :Typed Query 
		
		
	/*	TypedQuery<Employee> tqry=em.createQuery("Select e from Employee e ",Employee.class);
		
		List<Employee> empList =tqry.getResultList();
		
		for(Employee e:empList)
		{
			System.out.println(e.getEname() + "  " + e.getSalary()) ;
		}
		*/
		
		//Ex3 : search one record 
		
		/*
		TypedQuery<Employee> tqry=em.createQuery("Select e from Employee e where e.ename='Spike'",Employee.class);
		
		//TypedQuery<Employee> tqry=em.createQuery("Select e from Employee e where e.eid=105 ",Employee.class);
		
		List<Employee> empList =tqry.getResultList();
		
		for(Employee e:empList)
		{
			System.out.println(e.getEname() + "  " + e.getSalary()) ;
		}
		*/
		
		//Ex 6 : Dynamic query 
		
	/*	TypedQuery<Employee> tqry=em.createQuery("Select e from Employee e where e.ename=:p_name",Employee.class);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name: ");
		String pname=sc.next();
		tqry.setParameter("p_name", pname);
		
		
		List<Employee> empList =tqry.getResultList();
		
		for(Employee e:empList)
		{
			System.out.println(e.getEname() + "  " + e.getSalary()) ;
		}
		*/
		//Ex 6 update 
		
	/*	em.getTransaction().begin();
		Query qry=em.createQuery("Update Employee e set e.ename=:p_name where e.eid=:p_id");
		qry.setParameter("p_name", "NewVijay");
		qry.setParameter("p_id", 102);
		int i=qry.executeUpdate();
		System.out.println("record updated " +i);
		em.getTransaction().commit();*/
		
		/* Ex 7 
		Query qry=em.createQuery("Select SUM(e.salary) from Employee e" );
		Double sum=(Double) qry.getSingleResult();
		System.out.println(sum);
		*/
		
		
		//Ex 8 :   Concatenation 
		
	/*	Query qry=em.createQuery("select e from Employee e" +
								" where e.salary" +
								" between 20000 and 30000" );

		List<Employee> empList=qry.getResultList();
		System.out.println(empList);
 */
		
	/*	Query qry=em.createQuery("select e from Employee e where e.ename LIKE '%e%'" );
		List<Employee> empList=qry.getResultList();
		System.out.println(empList); */
				
		//Ex : Named query :  // complex query , need to rpeate the query / frequently used query 
		
	/*	Query qry=em.createNamedQuery("find employee by id");  
		// 1> query very complicated more tables , joins subqueries 
		// 2> need query many a times 
		qry.setParameter("id", 103);
		List<Employee> empList=qry.getResultList();
		System.out.println(empList);
		*/
		
		//Ex 11 :Pagination 		
		
	/*	List<Employee> empList=em.createQuery("Select e from Employee e")
				.setFirstResult(2) // fetching second record
				.setMaxResults(3) // max no of records 3 
				.getResultList();		
		System.out.println(empList);*/
   
		//Ex 12
	/*	Query qry= em.createQuery("select e FROM Employee e JOIN e.address a  where e.eid=108");	
		List<Employee> myList=qry.getResultList();	
		for( Employee e:myList)
		{
		System.out.println(e);
		}
		*/
		
	/*	Query qry1= em.createQuery("select e.ename,a.city FROM Employee e JOIN e.address a  where e.eid=108");

		
		
		List<Object[]> myList1=qry1.getResultList();
		
			for( Object[] myObj:myList1)
			{
			System.out.println(Arrays.toString(myObj));
			}
			*/
			
		
	
	}

}
