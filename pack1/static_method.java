package com.pack1;

public class static_method 
{
	int x=10;
	static int y=20;
	
	void meth1() {
		System.out.println("meth1() called.");
		System.out.println("Instance variable x:"+x);
		System.out.println("static variable y:"+y);
		System.out.println("..........................");

	}
	static void meth2() {
		System.out.println("meth2() called.");
		System.out.println("Instance variable x:"+new static_method().x);
		System.out.println("static variable y:"+y);
		System.out.println("..........................");
	}
	public static void main(String[] args) {
//		static_method obj=new static_method();
//		obj.meth1();
//		obj.meth2();
		meth2();
//		static_method.meth2();
		
	}
}
