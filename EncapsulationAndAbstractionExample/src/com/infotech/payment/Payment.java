package com.infotech.payment;

public class Payment {
	private static final String CASH = "CASH";
	private static final String CC = "CC";

	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.executePayment(CASH, 120.45);
		payment.executePayment(CC, 280.45);

	}

	private void executePayment(String mode, double amount) {
		IPayment iPayment;
		// If payment is in CASH
		if (mode.equalsIgnoreCase(CASH)) {
			iPayment = new CashPayment();
			iPayment.doPayment(amount);
		}
		// If payment is through credit card
		else if (mode.equalsIgnoreCase(CC)) {
			iPayment = new CreditCardPayment();
			iPayment.doPayment(129.78);
		}
	}
}