package com.data.input;

import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {

		Scanner  ob=new Scanner(System.in);
		long a,b;
		float c,d;
		String pranali;
		System.out.println("Enter value of a:");
		a=ob.nextLong();//for long
		
		System.out.println("Enter value of b:");
		b=ob.nextLong();
		
		System.out.println("Enter value of c:");
		c=ob.nextFloat();//for float
		
		System.out.println("Enter value of d:");
		d=ob.nextFloat();
		
		System.out.println("Enter your name:");
		pranali=ob.next();//for string
		
		System.out.println("Addition="+(a+b));
		System.out.println("Addition="+(c+d));
		System.out.println(pranali);
		ob.close();//closing resourse
	}

}
