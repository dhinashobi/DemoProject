package com.qa.crm.PracticeJavaPrograms;

import java.util.Arrays;

public class RemovedupUsingForLoop {

	public static void main(String[] args) {
		
		int [] array = {5,2,98,4,4,5,4,3,1};
		
		int length_array = array.length;
		
		for(int i=0;i<=length_array;i++) {
			
			for(int j=i+1; j<=length_array;j++) {
				
				if(array[i]==array[j]) {
					
					array[j] = array[length_array-1];
					j--;
					length_array--;					
				}
			}
			}
		
		Arrays.copyOf(array, length_array);
		
		for(int i=0;i<=length_array;i++) {
		System.out.print(array[i]+ ", ");
		}
		}
}
