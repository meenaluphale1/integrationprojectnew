package com.lnt.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Payments")
public class Payment {
	
	@Id
	@Column(name="Payment_Id")
	private int paymentId;
	
	@Column(name="Amount")
	private int amount;
	
	//@OneToOne
	@ManyToOne
	@JoinColumn(name="empNo")
	Employee emp;

		public Payment(int paymentId, int amount, Employee emp) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.emp = emp;
	}

	public Payment() {
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

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", emp=" + emp + "]";
	}
	
}

/*drop table payments 
create table Payments
(
Payment_Id Number(5),
Amount number(8),
empNo Number(5)
);

select * from empspring
insert into payments values(101,10000,102);
*/