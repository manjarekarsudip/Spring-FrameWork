package com.velocity;

public class Categories {     //Autowire - constructor
	
	private String name;
	private Policy policy;
	
	public String getName() {
		return name;
	}
	
	public Policy getPolicy() {
		return policy;
	}
	

	public Categories(String name, Policy policy) {
		super();
		this.name = name;
		this.policy = policy;
	}
	
	public Categories() {
		
	}

	public void show() {
		System.out.println("Category Name :" + name);
		System.out.println("Policy Name :" + policy.getPlanName());
		System.out.println("Policy Amount :" + policy.getPlanAmount());
		
	}
}
