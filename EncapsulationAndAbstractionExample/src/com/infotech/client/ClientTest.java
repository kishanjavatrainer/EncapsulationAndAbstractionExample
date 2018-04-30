package com.infotech.client;

import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		// This line will give compiler error age field can't be used directly as it is private
		// emp.age = 40;
		employee.setEmpId("EMP001");
		employee.setAge(30);
		employee.setFirstName("Sean");
		employee.setLastName("Murphy");
		System.out.println("Age- " + employee.getAge());
		System.out.println("Employee ID- " + employee.getEmpId());
		System.out.println("Full Name- " + employee.getFullName());
	}
}
