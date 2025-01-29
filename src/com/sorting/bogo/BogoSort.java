package com.sorting.bogo;

public class BogoSort {

	private int[] nums;
	public int counter;
	
	public BogoSort(int num[]) {
		this.nums=num;
	}
	
	public void sort() {
		
		while(!isSorted()) {
			counter++;
			shuffle();
		}
		showSortedArray();

	}

	//fisher and yates
	private void shuffle() {
		for (int i = nums.length-1; i >=0 ; i--) {
			int j=(int) (Math.random()*i);
			swap(i, j);
		}
	}

	private void showSortedArray() {
		System.out.println("No of Iteration = " +counter);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

	private void swap(int i, int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}

	private boolean isSorted() {
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i+1]<nums[i])
				return false;
		}
 		return true;
	}
}
