package com.exceptions;

public class MyException extends Exception {
	private String message;
	
	public MyException()
	{
		System.out.println("You got default exception");
	}
	
	public MyException(String message) {
		super(message);
		this.message = message;
	}

	public void showCause()
	{
		System.out.println("You got ABCD exception");
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		System.out.println("StackTrace over-ridden message");
	}
}
