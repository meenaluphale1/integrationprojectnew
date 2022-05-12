package com.lnt.appl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.appl.beans.Payment;
import com.lnt.appl.beans.Payment2;
import com.lnt.appl.services.PaymentService;

@CrossOrigin(origins = "*") // any url, any, port no, any server
@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService payService;
	
	//http://localhost:8090/payment/paybill
	@PostMapping("/paybill")
	public Payment payBill(@RequestBody Payment p)
	{
		Payment p1=payService.payBill(p);
		return p1;
	}

	//http://localhost:8090/payment/paybill2
	@PostMapping("/paybill2")
	public Payment2 payBill2(@RequestBody Payment2 p)
	{
		System.out.println("called paybill2 in controller ");
		Payment2 p1=payService.payBill2(p);
		return p1;
	}
}
