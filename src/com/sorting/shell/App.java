package com.sorting.shell;

public class App {

	public static void main(String[] args) {
		
		int[] nums= {5,3,0,1,-3,6,6 ,7}; 
		ShellSort sort=new ShellSort(nums);
		sort.sort();
		
	}

}
