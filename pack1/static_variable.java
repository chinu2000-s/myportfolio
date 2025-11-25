package com.pack1;

public class static_variable 
{
	int x;
	static int y;
	public static_variable()
	{
		x++;
		y++;
		System.out.println("Instance variable x:"+x);
		System.out.println("static variable y:"+y);
		System.out.println(".............................");

	}
	
	public static void main(String[] args) {
		new static_variable();
		new static_variable();
		new static_variable();

	}
}
