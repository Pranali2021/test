package org.dynamic.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TempConversion {

	public static void main(String[] args) throws NumberFormatException, IOException {

		double c,f;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the temperature");
		f=Double.parseDouble(ob.readLine());
		c=(5*f-160)/9;
		
		System.out.println("Temperature in centigrate:"+c);
	}

}
