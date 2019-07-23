package com.qa.crm.PracticeJavaPrograms;

public class Palindrome {
	
	
	
	public static void palindromeUsingNormalMethod(String str) {
		
		int length = str.length();
		String reverse = "";
		String temp = str;
		for(int i=length-1;i>=0;i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.println("Reversed string is : "+ reverse);
	if(temp.equalsIgnoreCase(reverse)) {
		System.out.println(reverse+ " : is palindrome");
	}
	else {
		System.out.println(reverse+ " : is not palindrome");
	}
	}
	public static void palindromeUsingStringBuffer(String str) {
		
		String temp = str;
		StringBuffer sb= new StringBuffer(str);		
		System.out.println("Reversed string is : " + sb.reverse());
		String rev = sb.toString();
		
		if(temp.equalsIgnoreCase(rev)) {
			System.out.println(rev+" : is palindrome");
		}
		else {
			System.out.println(rev+" :is not palindrome");
		}
	}

	public static void main(String[] args) {
		
		palindromeUsingNormalMethod("GeekeeG");
		palindromeUsingStringBuffer("GeekeeG");
	}

}
