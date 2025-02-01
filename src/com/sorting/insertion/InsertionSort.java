package com.sorting.insertion;

public class InsertionSort {

	private int[] nums;

	public InsertionSort(int nums[]) {
		this.nums=nums;
	}
	
	public void sort() {
		for (int i = 0; i < nums.length; i++) {
			int j=i;
			while(j>0 && nums[j-1]>nums[j]) {
				swap(j-1, j);
				j--;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+ " ");
		}
	}

	private void swap(int i, int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]= temp;
	}
}
