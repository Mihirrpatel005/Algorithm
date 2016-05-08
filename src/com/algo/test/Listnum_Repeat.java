package com.algo.test;

import java.util.HashMap;

public class Listnum_Repeat {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5, 8 };
		int b[] = { 2, 2, 5, 4, 5, 3, 4, 8, 1 };

		HashMap<Integer, Integer> hm = new HashMap<>();

		int n = a.length;
		int n1 = b.length;
		int key = 0, key1 = 0;
		for (int j = 0; j < n; j++) {

			key = a[j];

			for (int k = 0; k < n1; k++) {
				key1 = b[k];
				if (key == key1) {

					if (hm.containsKey(key)) {

						int value = hm.get(key) + 1;
						hm.put(key, value);
					} else {
						hm.put(key, 1);
					}
				}

			}
		}

		System.out.println(hm);

	}

}
