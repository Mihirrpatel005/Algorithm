package com.algo.test;

import java.util.StringTokenizer;

public class String_word_reverse {

	public static void main(String[] args) {

		String s = "I am a JavaDeveloper";
		String s_rev = "";
		String reverse;
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
			reverse = st.nextToken();
			s_rev += String_reverse(reverse);

		}
		System.out.println(s_rev);

	}

	private static String String_reverse(String input) {

		int n = input.length();
		String output = "";
		for (int i = n-1; i >= 0; i--) {
			output += input.charAt(i);
		}

		return output + " ";
	}

}
