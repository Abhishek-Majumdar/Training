package com.demo;

@FunctionalInterface
public interface MyInterface {
	
	void showData();
	default void getData() {
		
	}

}
