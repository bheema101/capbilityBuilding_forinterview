package com.practice.stringmanipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxPalindromeString {

	public static void main(String[] args) {
			String text = "forgeeksskeegfor";
			int maxpalidromeString = maxpalidromeString(text);
			System.out.println("  length :"+maxpalidromeString);
			
			
	}
	
		 
	static void printSubStr(String str, int low, int high) {
		System.out.print( "max palindrome String: "+str.substring(low, high + 1));
	}
	 
	 public static int maxpalidromeString(String str) {
         int start =0;
		 int maxLength =0;
		 int low,high;
		 int len = str.length();
		 for(int i =1;i<str.length(); ++i) {
			
			 //even
			  low = i-1;
			  high = i;
			  while(low>=0&& high<len&& 
				(str.charAt(low) == str.charAt(high))){
				  if (high - low + 1 > maxLength) { 
						start = low; 
						maxLength = high - low + 1; 
					} 
				--low;
				++high;
				
			  }
			  
			  low = i-1;
			  high = i+1;
			  while(low>=0&&high<len && str.charAt(low) == str.charAt(high)) {
				  if (high - low + 1 > maxLength) { 
						start = low; 
						maxLength = high - low + 1; 
					} 
				    --low;
					++high;
			  }
			  
		 }
		 printSubStr(str, start, start + maxLength - 1);
		
		
		return maxLength;
		 
	 }
	 
	 
//	 static int  Maxpalidrome(String s) {
//		 int maxpalidromeString = 0;
//		 if(s !=null) {
//			 String lowercase = s.toLowerCase(); 
//			 char[] characters = lowercase.toCharArray();
//			 Map<Character, Integer> charouccrence = new HashMap<>();
//			 int length = characters.length;
//			 for(int i=0;i<length;i++) {
//				 char element = characters[i];
//				 if(!Character.isWhitespace(element)) {
//					 if(charouccrence.containsKey(element)) {
//						 charouccrence.put(element, charouccrence.get(element)+1);
//					 }else {
//						 charouccrence.put(element, 1);
//					 }
//				 }
//
//
//			 }
//			 
//			 
//			 Set<Entry<Character, Integer>> entrySet = charouccrence.entrySet();
//			
//			 for(Entry<Character, Integer> entry : entrySet) {
//				int count =  entry.getValue();
//				if(count%2 !=0 ) {
//				   count = count-1;
//				}
//				 switch(count) {
//				 case 2 :
//					 maxpalidromeString = maxpalidromeString+ count;
//					 break;
//				 case 4: 
//					 maxpalidromeString = maxpalidromeString+ count;
//					 
//					 break;
//				 case 6: 
//					 maxpalidromeString = maxpalidromeString+ count;
//					 break;
//				 case 8: 
//					 maxpalidromeString = maxpalidromeString+ count;
//					 break;
//				 case 10: 
//					 maxpalidromeString = maxpalidromeString+ count;
//					 break;
//				 case 12: 
//					 maxpalidromeString = maxpalidromeString+ count;
//					 break;
//				
//				 }
//				 
//				 
//				
//			 }
//			 
//			 
//			 
//		 }
//		
//		return maxpalidromeString;
//		 
//	 }
	 

	 
	 

}
