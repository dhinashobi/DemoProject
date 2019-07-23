package com.qa.crm.PracticeJavaPrograms;

public class FindMaxiAndMiniNumber {
	
	public static void maxi(int[] a) {
		
		int maxi = a[0];
		for(int i=0;i<a.length;i++) {
			if(maxi<a[i]) {
				maxi=a[i];
			}
		}
		System.out.println("Maximum number in the given array is: "+ maxi);		
	}
	
	public static void mini(int[] a) {
		
		int mini = a[0];
		for(int i=0;i<a.length;i++) {
			if(mini>a[i]) {
				mini=a[i];
			}
		}
		
		System.out.println("Minimum number in the given array is: "+ mini);		
		
		
	}

	public static void main(String[] args) {
	
			int [] a = {4,98,6,78,32};
			maxi(a);
			mini(a);
	}

}
