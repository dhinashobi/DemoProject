package com.qa.crm.PracticeJavaPrograms;

public class BubbleSort {
	
	
	public static void bubbleSort(int [] a) {
		
		int length = a.length;
		int temp =0;
		
		for(int i=0;i<length;i++) {
			
			for(int j=i+1;j<length;j++) {
				
				if(a[i]>a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;				
				}
				
			}
		}
		for(int k=0;k<length;k++) {
			System.out.print(a[k]+ ",");
		}
	}

	
	public static void main(String[] args) {
		
		int [] a = {4,9,3,6,1};
		
		bubbleSort(a);
		
	}
	
	
}
