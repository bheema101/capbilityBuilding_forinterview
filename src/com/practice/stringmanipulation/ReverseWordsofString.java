package com.practice.stringmanipulation;

import java.util.StringJoiner;

//Take sample sentence and print reverse words of sentence.
public class ReverseWordsofString {
	public static void main(String args[]) {
		String inputString = "String the to welcome";
//		String reverseWords = reverseWords(inputString);
//		System.out.println("reverseWords :"+reverseWords);
		String reverseString = reverString("ameehb", 6);
		System.out.println("Rev Word : "+reverseString);
		
	}

	
	public static String reverseWords(String input) {
		
		String[] words = input.split(" ");
		StringBuilder sb = new StringBuilder();
		StringJoiner joiner = new StringJoiner(" ");
		int index = words.length-1;
		for(;index>=0;index--) {
			joiner.add(words[index]);
		}
		
		return joiner.toString();
		
	}
	
	
	
	public static String reverString(String s, int index) {
		if(index > 0)
		{
			return s.charAt(--index) + reverString( s, index);
		}
		else
		{
			return "";
		}
	}
	
	 }
