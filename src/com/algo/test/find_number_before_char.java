package com.algo.test;

public class find_number_before_char {

	public static void main(String[] args) {

		String address = "25w873 Apple St.";

		int count = 0, j = 0;
		boolean period = false;
		for (String str : address.split(" ")) {
			// System.out.println(str);
			if (count == 0) {
				j = getDistanceFromCityCenter(str);
				System.out.println(j + "  >>");
			}
			if (count == 2) {
				period = isPeriod(str);
				System.out.println(period);
			}
			count++;

		}

		if (count == 3 && j > 0 && period) {
			System.out.println("valid");
		} else {
			System.out.println("not valid");
		}

	}

	public static boolean isPeriod(String str) {
		char las_period = str.charAt(str.length() - 1);
		if (las_period == 46) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isDigit(String str) {

		final StringBuilder sb = new StringBuilder(str.length());
		for (int i = 0; i < str.length(); i++) {
			final char c = str.charAt(i);

			if (c > 47 && c < 58) {

				sb.append(c);

			}
		}
		if (str.length() == sb.length()) {
			return true;
		} else {
			return false;
		}

	}

	public static int getDistanceFromCityCenter(String address) {

		String miles = "";
		String Street = "";
		int cou = 0;
		final StringBuilder sb = new StringBuilder(address.length());
		for (int i = 0; i < address.length(); i++) {
			final char c = address.charAt(i);

			if (c > 96 && c < 123) {
				// break;
				sb.append(c);
				cou++;

			} else {
				if (cou == 0) {
					miles += c;
				} else if (cou == 1) {
					Street += c;
				}

			}
		}
		if (sb.length() == 1 && isDigit(miles) && isDigit(Street)) {

			int i = Integer.parseInt(miles);
			return i;
		}

		return 0;

	}

}
