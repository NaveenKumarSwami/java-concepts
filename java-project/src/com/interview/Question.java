package com.interview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question {
	public static void main(String[] args) {
		String str = "abbcdeabfgz";
//		System.out.println(firstRepeatedChar(str));
//		System.out.println(firstRepeatedCharByUsingArray(str));
//		getData();
//		System.out.println(getData2());
		String str1 = "My name is Naveen";
		System.out.println(stringPar(str1));
	}

	public static String stringPar(String str) {

		StringBuilder strBu = new StringBuilder();

		String[] words = str.split(" ");

		for (int i = 0; i <= words.length / 2; i++) {
			StringBuilder reverseWord = new StringBuilder(words[i]).reverse();
			strBu.append(reverseWord);
			if (words.length - i - 1 == i) {
				break;
			}
			strBu.append(" ").append(words[words.length - i - 1]).append(" ");
		}

		return strBu.toString();
	}

	public static void getData() {

		try {
			System.out.println("try");
			int x = 1 / 0;
		} catch (Exception e) {
			System.out.println("catch");

		}
		// unreachable code
//			catch (NullPointerException e) { 
//		}
		finally {
			System.out.println("finally");
		}
	}

	public static void getData1() {

		try {
			System.out.println("try");
			int x = 1 / 0;
		} catch (Exception e) {
			System.out.println("catch");

			System.exit(1);
		}
		// here finally not printed
		finally {
			System.out.println("finally");
		}
	}

	public static int getData2() {

		try {
			System.out.println("try");
			return 1 / 0;
		} catch (Exception e) {
			System.out.println("catch");
			return 5;
		}
		// here finally not printed
		finally {
			System.out.println("finally");
		}
	}

	/**
	 * find first repeated character
	 * 
	 * @param str
	 * @return
	 */
	public static Character firstRepeatedChar(String str) {
		Set<Character> charSet = new HashSet<>();
		for (Character ch : str.toCharArray()) {
			if (charSet.contains(ch)) {
				return ch;
			} else {
				charSet.add(ch);
			}
		}

		return null;
	}

	public static char firstRepeatedCharByUsingArray(String str) {
		int[] alphArr = new int[26];
//       SCII value for :  
//		 A -> 69
//		 a -> 97
//       char a = 97;
//		System.out.println(a);
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 97;
			if (alphArr[val] == 1) {
				return str.charAt(i);
			}
			alphArr[val] = 1;
		}
		return '\0'; // '\0' is null

	}
}