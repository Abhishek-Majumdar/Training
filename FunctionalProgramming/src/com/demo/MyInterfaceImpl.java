package com.demo;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println("Showing data from implementation class");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface m = new MyInterfaceImpl();
		m.showData();
	}

}
