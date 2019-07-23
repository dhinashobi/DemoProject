package com.qa.crm.PracticeJavaPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class NoOfOccurances {
	
	public static int countv2(String a,String b) {
		int count =0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(0)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String abc = "GreeksforGreeks";
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<abc.length();i++) {
		set.add(String.valueOf(abc.charAt(i)));
		}
		
		for(String val:set) {
			System.out.println("character occurances of "+val+" "+NoOfOccurances.countv2(abc, val));
		}
	}

}
