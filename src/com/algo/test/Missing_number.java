package com.algo.test;

public class Missing_number {

	public static void main(String[] args) {

		int a[] = { 1, 3, 6, 9 };

		int n = a.length;
		int mis_num[] = new int[n];
		int temp, next;
		for (int i = 0; i < n; i++) {
			temp = a[i];
			next = temp + 1;
			for (int j = 0; j < n - 1; j++) {
				if (next != a[j]) {
					next++;
				} else {
					mis_num[i] = next;
				}
			}

		}

		for (int k = 0; k < n; k++) {
			System.out.println(mis_num[k]);

		}

	}

}
