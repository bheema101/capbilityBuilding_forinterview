package com.practice.stringmanipulation;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String input = "eefaccabbdds";
		// int printFirstNonRepeatChar = printFirstNonRepeatChar(input);
		int printFirstNonRepeatChar = printfirstNonRepetCharwithCollection(input);

		if (printFirstNonRepeatChar != -1) {
			System.out.println("printFirstNonRepeatChar : " + input.charAt(printFirstNonRepeatChar));
		} else {
			System.out.println("there is no Nonrepeat characters  in the string ");
		}

		System.out.println("printFirstNonRepeatChar :" + printFirstNonRepeatChar);

	}

	static int printfirstNonRepetCharwithCollection(String input) {
		char[] inputArray = input.toCharArray();
		Map<Character, Integer> charcount = new LinkedHashMap<>();
		for (char c : inputArray) {
			if (charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c) + 1);
			} else {
				charcount.put(c, 1);
			}
		}
		int nonRepeatcharIndex = -1;

		for (Entry<Character, Integer> entrySet : charcount.entrySet()) {
			if (entrySet.getValue() == 1) {

				nonRepeatcharIndex = input.indexOf(entrySet.getKey());
				break;// becasue we first one
			}
		}

		return nonRepeatcharIndex;
	}

	static int printFirstNonRepeatChar(String input) {
		char[] inputArray = input.toCharArray();
		int nonRepeatcharIndex = -1;
		for (int i = 0; i < inputArray.length; i++) {
			char element = inputArray[i];
			boolean unique = true;
			for (int j = 0; j < inputArray.length; j++) {
				// skipping for the same index (itself)
				if (i != j) {
					if (element == inputArray[j]) {
						unique = false;
						break;// if once we found duplicate then move to next element
					}
				}
			}
			if (unique) {
				nonRepeatcharIndex = i;
				break;// becasue we want first one
			}
		}

		return nonRepeatcharIndex;
	}

}
