package com.sorting.radixsort;

public class App {

	public static void main(String[] args) {
		
		int[] nums= {12, 56, 34, 99, 78, 0};
		RadixSort sort=new RadixSort(nums);
		sort.sort();
		sort.showArray();
	}

}
