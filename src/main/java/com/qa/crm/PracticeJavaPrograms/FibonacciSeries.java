package com.qa.crm.PracticeJavaPrograms;

public class FibonacciSeries {
	
	public static void fibonacciSeries() {
		
		int n1 = 0;
		int n2 = 1;
		int sum=0;
		
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=0;i<8;i++) {
			
			sum =n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);			
		}
		
		
	}

	public static void main(String[] args) {
		fibonacciSeries();
	}

}
