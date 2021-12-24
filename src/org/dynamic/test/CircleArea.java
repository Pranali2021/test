package org.dynamic.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleArea {

	public static void main(String[] args) throws NumberFormatException, IOException {
				double pi=3.14,r,area,peri;
				BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the radius");
				r=Double.parseDouble(ob.readLine());
				area=pi*r*r;
				peri=2*pi*r;
				
			    System.out.println("Area="+ area);
				System.out.println("perimeter="+ peri);
	}

}
