package com.lnt.appl.daos;

import com.lnt.appl.beans.Payment;
import com.lnt.appl.beans.Payment2;

public interface PaymentDao {
	
	public Payment payBill(Payment p);
	public Payment2 payBill2(Payment2 p);

}
