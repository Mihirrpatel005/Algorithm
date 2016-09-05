package com.algo.test;

public class Bivalue_slice {

	public static void main(String[] args) {

		int b[] = { 5, 4, 4, 5, 0, 12 };

		System.out.println(slice(b));

	}

	public static int slice(int[] a) {
		// int a[] = { 5, 4, 4, 5, 0, 12 };
		int n = a.length;
		int c = 0;

		for (int i = 0; i < n; i++) {

			if (i <= n) {
				for (int j = i; j < n; j++) {

					if (a[i] == a[n - 1 - i]) {
						c = a[i];

					}
				}

				n--;
			}

		}
		// System.out.println(c);
		return c;
	}

}
