package com.sorting.bubble;

public class BubbleSort {

	private int[] nums;
	
	public BubbleSort(int nums[]) {
		this.nums=nums;
	}

	public void sort() {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length-i-1; j++) {
				if(nums[j+1]<nums[j])
					swap(j+1, j);
			}
		}
		
		sortedArray();
	}

	private void sortedArray() {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

	private void swap(int i, int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
}
