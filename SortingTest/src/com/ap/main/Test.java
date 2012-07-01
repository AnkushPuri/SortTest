package com.ap.main;

import com.ap.sorting.BubbleSort;

public class Test {

	public static void main(String args[]){
		
		BubbleSort bubbleSort = new BubbleSort();
		
		Integer[] array = new Integer[]{5,6,1,4,9,3,22,8};
		
		for(int i : array){
			System.out.print(i+" ");
		}
		
		bubbleSort.sort(array);
		
		System.out.println("\nAfter Sorting");
		for(int i : array){
			System.out.print(i+" ");
		}
		
	}
	
}
