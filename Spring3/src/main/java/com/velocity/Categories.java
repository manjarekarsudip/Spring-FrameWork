package com.velocity;

public class Categories {     //Autowire - byName
	
	private String name;
	private Policy policy;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public void show() {
		System.out.println("Category Name :" + name);
		System.out.println("Policy Name :" + policy.getPlanName());
		System.out.println("Policy Amount :" + policy.getPlanAmount());
		
	}
}
