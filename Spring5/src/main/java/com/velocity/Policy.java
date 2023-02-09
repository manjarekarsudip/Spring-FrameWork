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
	
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public void setPlanAmount(String planAmount) {
		this.planAmount = planAmount;
	}
	
	public Policy(String planName, String planAmount) {
		super();
		this.planName = planName;
		this.planAmount = planAmount;
	}
	public Policy() {
		
	}
	
	
}
