package com.lnt.appl.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.appl.beans.Payment;
import com.lnt.appl.beans.Payment2;

@Repository
public class PaymentDaoImpl implements PaymentDao {
	
	@PersistenceContext
	EntityManager em1;

	@Override
	@Transactional
	public Payment payBill(Payment p) {
		System.out.println("Dao payment " +p);
		em1.persist(p);
		return p;
	}

	@Override
	@Transactional
	public Payment2 payBill2(Payment2 p2) {
		System.out.println("Dao payment " +p2);
		em1.persist(p2);
		return p2;
	}

	
}


/*how to add Payment object from postman :
  {
"paymentId":112,
"amount":10000,
"emp": {
    "empNo":103,
    "eName":"Ajay",
    "eSal":10000      
   }    
}
 */
