package com.qa.crm.PracticeJavaPrograms;

public class OccurancesOfWord {
	
	public static void occurances(String str, char s) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==s) {
				count++;
			}
		}
		
		System.out.println("Occurances of Word = "+ s+ " count is "+ count);
		
		
	}

	public static void main(String[] args) {
		
		String str = "GeeksforGeeks";
		
		occurances(str, 'e');

	}

}
