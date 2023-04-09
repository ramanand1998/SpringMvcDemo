package com.example.SpringMvcDemo.contolller;

public class Employee {

	
	String name;
	String roll;
	String company;
	String baseLocation;
	
	public Employee(String name, String roll, String company, String baseLocation) {
		super();
		
		this.name = name;
		this.roll = roll;
		this.company = company;
		this.baseLocation = baseLocation;
	}
	@Override
	public String toString() {
		return "User [ name=" + name + ", roll=" + roll + ", company=" + company + ", baseLocation="
				+ baseLocation + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}
}
