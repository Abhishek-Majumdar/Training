package com.exceptions;

public class TestMyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = args.length;
			int b = 10/a;
			System.out.println(a);
//			{
//				throw new MyException("Invalid age");
//			}
		} catch (ArithmeticException e) {
			System.out.println("1");
		}

	}

}
