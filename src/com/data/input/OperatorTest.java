package com.data.input;

public class OperatorTest {

	public static void main(String[] args) {

		int a=10, b=17, c=76, x=10;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);// Modulus Operator
		
		System.out.println(a>b && b>c);// and operator
		System.out.println(a>b || b>c);//or operator
		System.out.println(a!=b);//not operator
		System.out.println(a==b);//Equality operator
		
		a+=5;//a=a+5
		System.out.println(a);
		a-=5;//a=a-5
		System.out.println(a);
		a*=2;//a=a*2
		System.out.println(a);
		a/=4;//a=a/4
		System.out.println(a);
		
		System.out.println(a&b);//bitwise and operator
		System.out.println(a|b);
		System.out.println(a>>2);//right shift operator
		System.out.println(a<<2);//left shift operator
		
		a=10;
		b=17;
		System.out.println(++a + --b - b-- + ++a * b--);
		System.out.println(x);
		
		//int y=(20>30)?"java":"c++"//ternary operator
		//System.out.println(s);
	}

}
