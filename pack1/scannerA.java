package com.pack1;

import java.util.Scanner;

public class scannerA 
{
	public int meth1(int a,int b) 
	{
		
//		System.out.println("enter the value");
		System.out.println("enter the value of a:"+a);
		
		System.out.println("enter the value of b:"+b);
		
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(new scannerA().meth1(sc.nextInt(),sc.nextInt()));
	}
}
