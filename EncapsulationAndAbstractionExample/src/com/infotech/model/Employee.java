package com.infotech.model;

public class Employee {

	private String empId;
    private String firstName;
    private String lastName;
    private int age;
    
    public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// method for getting full name
    public String getFullName(){
     return this.firstName + " " + this.lastName;
    }  
}