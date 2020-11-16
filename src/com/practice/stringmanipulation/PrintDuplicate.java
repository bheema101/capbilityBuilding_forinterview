package com.practice.stringmanipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		
		String printDuplicates = printDuplicatesUsingCollection("ababc");
		System.out.println("printDuplicates :"+printDuplicates);
		

		String printDuplicates2 = printDuplicates("caabbc");
		System.out.println("printDuplicates :"+printDuplicates2);
	}
	
	static String printDuplicates(String input) {
		
		char[] inputArray = input.toCharArray();
		char[] outputArray = new char[input.length()];
		int newArrayIndex =0;
		
		for(int i=0;i<inputArray.length;i++) {
			char element = inputArray[i];
			for(int j=i+1;j<inputArray.length;j++) {
				if(element == inputArray[j]) {
					outputArray[newArrayIndex] =element;
					newArrayIndex++;
				}
			}
		}
		return new String(outputArray);
	}
	
	static String printDuplicatesUsingCollection(String input) {
		char[] inputArray = input.toCharArray();
		char[] outputArray = new char[input.length()];
		Map<Character,Integer> charcount = new HashMap<>();
		for(char c : inputArray) {
			if(charcount.containsKey(c)) {
				charcount.put(c,charcount.get(c)+1);
			}else {
				charcount.put(c,1);
			}
		}
		int outputindex = 0;
		for(Entry<Character, Integer> entrySet : charcount.entrySet()) {
			if(entrySet.getValue()>1) {
				outputArray[outputindex] = entrySet.getKey();
				outputindex++;
			}
		}
		
		return new String(outputArray);
	}
	
	
	

}
