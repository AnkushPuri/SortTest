package com.ap.sorting;

public class InsertionSort {

	public static void sort(Integer[] array){
		
		int size = array.length,i,j;
		
		for(i=1;i<size;i++)
		{
			j=i;
			while(j>0 && array[j]<array[j-1]){
				swap(array,j,j-1);
				j--;
			}
		}
	}
	
	public static void swap(Integer[] array,int i,int j){
		int temp = array[i];
		array[i] = array[j];
		array[j]=temp;
	}
	
	
}
