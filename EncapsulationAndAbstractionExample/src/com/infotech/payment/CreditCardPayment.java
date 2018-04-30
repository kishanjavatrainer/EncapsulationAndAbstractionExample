package com.infotech.payment;

public class CreditCardPayment implements IPayment {

	@Override
	public void doPayment(double amount) {
		System.out.println("CreditCard payment " + amount);
	}
}