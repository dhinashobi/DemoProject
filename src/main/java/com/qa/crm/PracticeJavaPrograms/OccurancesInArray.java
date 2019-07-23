package com.qa.crm.PracticeJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class OccurancesInArray {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("god","god","god","man"));
		
		Set<String> set = new LinkedHashSet<String>(list);
		
		for(String ele : set) {
			
			System.out.println("The frequency of the word : "+ ele+ " is :" +Collections.frequency(list, ele));
			
		}

	}

}
