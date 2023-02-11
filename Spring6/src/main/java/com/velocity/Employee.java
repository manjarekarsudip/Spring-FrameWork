package com.velocity;

public class Employee {

	private String fullName;
	private Address address;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void getAllEmployeeData() {
		System.out.println("Employee Name :" + fullName);
		System.out.println("Employee Address :"+ address.getAddressArea());
	}
}
