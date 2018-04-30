package com.infotech.payment;

public class CashPayment implements IPayment {

	@Override
	public void doPayment(double amount) {
		System.out.println("Cash payment " + amount);
	}
}