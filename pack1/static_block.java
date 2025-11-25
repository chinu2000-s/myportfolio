package com.pack1;

public class static_block {
	final static int x=50;
	final static int y;
	
	static {
		System.out.println("1st static block called.");
		y=100;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	public static void main(String[] args) {
		System.out.println("\n main() called.");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	static {
		System.out.println("\n2nd static block called.");
//		y=500;    //compile time error.
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
}
