package com.sorting.quick;

public class QuickSort {

	private int[] nums;

	public QuickSort(int[] nums) {
		this.nums=nums;
	}
	
	public void sort() {
		sort(0, nums.length-1);
	}
	
	private void sort(int low, int high) {
		if(high<low) return;
		int mid=partition(low, high);
		sort(low, mid-1);
		sort(mid+1, high);
	}

	private int partition(int low, int high) {
		
		int pivot=(low+high)/2;
		swap(pivot, high);
		int i=low;
		for (int j = low; j < high; j++) {
			if(nums[j]<=nums[high]) {
				swap(i, j);
				i++;
			}
		}
		swap(i, high);
		return i;
	}

	private void swap(int pivot, int high) {
		int temp=nums[pivot];
		nums[pivot]=nums[high];
		nums[high]=temp;
	}
	
	public void showArray() {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
