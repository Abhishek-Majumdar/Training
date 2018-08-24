package com.citi.domain;

public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public Animal() {
		name = "No name";
		// TODO Auto-generated constructor stub
	}
	
	public void description() {
		System.out.println("name: " + name);
	}
	
	

}
