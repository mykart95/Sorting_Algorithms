package com.sorting.merge;

public class App {

	public static void main(String[] args) {
		int[] nums= {4,3,-2};
		MergeSort sort=new MergeSort(nums);
		sort.sort();
		sort.showArray();
	}

}
