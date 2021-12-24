package org.dynamic.test;

import java.io.InputStreamReader;

public class initializationdemo {

	public static void main(String[] args) throws NumberFormatException, IOExpection {
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader1 ob=new BufferedReader1(in);
		
		long a,b; //variable Declaration
		System.out.println("Enter value of a:");
		a=Long.parseLong(ob.readLine());
		
		System.out.println("Enter value of b:");
		b=Long.parseLong(ob.readLine());
		
		System.out.println(a+b);
		
		System.err.println("This is an example of error Stream");

	}

}
