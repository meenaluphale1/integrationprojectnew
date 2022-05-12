package com.lnt.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Payments2")
public class Payment2 {
	@Id
	@Column(name="Payment_Id")
	private int paymentId;
	
	@Column(name="Amount")
	private int amount;
	
	    //@OneToOne
		//@ManyToOne
		//@JoinColumn(name="empNo")
		private int empNo;

		public Payment2(int paymentId, int amount, int empNo) {
			super();
			this.paymentId = paymentId;
			this.amount = amount;
			this.empNo = empNo;
		}

		public Payment2() {
			super();
		}

		public int getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(int paymentId) {
			this.paymentId = paymentId;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public int getEmpNo() {
			return empNo;
		}

		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}

		@Override
		public String toString() {
			return "Payment2 [paymentId=" + paymentId + ", amount=" + amount + ", empNo=" + empNo + "]";
		}
		
	}

/*
 * create table Payments2
(
Payment_Id Number(5),
Amount number(8),
empNo Number(5)
);


insert into payments2 values(101,10000,102);
*/
