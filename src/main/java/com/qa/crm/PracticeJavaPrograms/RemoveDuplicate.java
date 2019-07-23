package com.qa.crm.PracticeJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void removeDup(ArrayList<Integer> list) {
		
		
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(list);
		list.clear();
		list.addAll(set);	
		
		for(int s : list) {
			System.out.print(s+",");
		}
			}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(5,4,6,8,1,5,4,6,8));
		
		removeDup(list);	
	}

}
