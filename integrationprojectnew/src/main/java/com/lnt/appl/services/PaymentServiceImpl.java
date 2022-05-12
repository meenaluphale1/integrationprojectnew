package com.lnt.appl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.appl.beans.Payment;
import com.lnt.appl.beans.Payment2;
import com.lnt.appl.daos.PaymentDao;

@Service
public class PaymentServiceImpl implements PaymentService
{

	@Autowired
	PaymentDao paymentDao;
	
	@Override
	public Payment payBill(Payment p) {
		System.out.println("payment service " +p);
		Payment p1=paymentDao.payBill(p);
		return p1;
			
	}

	@Override
	public Payment2 payBill2(Payment2 p2) {

		System.out.println("payment service " +p2);
		Payment2 p1=paymentDao.payBill2(p2);
		return p2;
	}
	
}