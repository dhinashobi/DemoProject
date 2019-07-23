package com.qa.crm.PracticeJavaPrograms;

public class ReverseNum {
	
	public static void reverseNum(int n) {
		
		int rem=0;
		int sum=0;
		int temp = n;
		
		
		while(n>0) {
			rem = n%10;
			sum = sum*10+rem;
			n=n/10;			
		}
		
		System.out.println("Reversed Number is : "+ sum);

		if(sum == temp) {
			System.out.println(sum+" is palindrome");
		}
		else {
			System.out.println(sum+ " is not palindrome");
		}
	}
	public static void main(String[] args) {
	
		reverseNum(151);

	}

}
