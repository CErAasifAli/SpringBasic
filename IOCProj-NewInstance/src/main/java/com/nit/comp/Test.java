package com.nit.comp;

public class Test {
	private int a=10;
	private String b="Hello";
	
	public Test(int a, String b) {
		System.out.println("Test::2-param constructor");
		this.a =a;
		this.b=b;
	}
	public Test() {
		System.out.println("Test:: O-param Constructor");
		
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
}
