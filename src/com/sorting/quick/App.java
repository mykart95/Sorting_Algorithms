package com.sorting.quick;

public class App {

	public static void main(String[] args) {
		int[] nums= {4, 3, -2};
		QuickSort sort=new QuickSort(nums);
		sort.sort();
		sort.showArray();
	}

}
