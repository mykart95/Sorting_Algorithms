package com.sorting.radixsort;

import java.util.Arrays;

public class CountingSortArbitrary {

	private static final int ITEMS = 10;
	private int[] data;
	private int max;
	private int min;

	public CountingSortArbitrary(int[] data) {
		this.data = data;
		this.min = Arrays.stream(data).min().getAsInt();
		this.max = Arrays.stream(data).max().getAsInt();
	}

	public void sort() {
		int[] output = new int[data.length];
		int[] count = new int[max - min + 1];

		for (int i = 0; i < data.length; i++) {
			count[data[i] - min]++;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}

		for (int i = data.length-1; i >= 0; i--) {
			count[data[i] - min]--;
			output[count[data[i] - min]] = data[i];
		}

		for (int i = 0; i < data.length; i++) {
			data[i] = output[i];
		}
	}

	public void showArray() {
		for(int num:data) {
			System.out.print(" "+num);
		}
	}
}
