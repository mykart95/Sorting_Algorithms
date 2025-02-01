package com.sorting.selection;

public class SelectionSort {

	private int nums[];
	
	public SelectionSort(int[] nums) {
		this.nums=nums;
	}
	
	public void sort() {
		for (int i = 0; i < nums.length; i++) {
			int index=i;
			for (int j = i+1; j < nums.length; j++) {

				if(nums[j]<nums[index])
					index=j;
			}
			if(index!=i) {
				int temp=nums[i];
				nums[i]=nums[index];
				nums[index]=temp;
			}
		}
		showArray();
	}
	
	private void showArray() {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
