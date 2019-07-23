package com.qa.crm.PracticeJavaPrograms;

public class SwapWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		String[] st = str.split(" ");
		
		String a = st[0];
		String b = st[1];
		
		a = a+b;
		
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("After swapped the Value of a is:  "+ a + " & the value of b is : "+ b);
		

	}

}
