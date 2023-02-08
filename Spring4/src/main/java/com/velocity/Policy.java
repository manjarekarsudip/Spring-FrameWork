package com.velocity;

public class Policy {

	private String planName;
	private String planAmount;
	
	public String getPlanName() {
		return planName;
	}
	public String getPlanAmount() {
		return planAmount;
	}
	public Policy(String planName, String planAmount) {
		super();
		this.planName = planName;
		this.planAmount = planAmount;
	}
	public Policy() {
		
	}
	
	
}
