package com.ap.sorting;

public class BubbleSort {

	public Integer[] sort(Integer array[]){
		
		int size = array.length;
		
		for(int i=size-1;i>=1;i--){
			
			for(int j=0;j<i;j++){
				
				if(array[j]>array[j+1]){
					int c = array[j];
					array[j]=array[j+1];
					array[j+1]=c;					
				}
			}
			
		}
	return array;
	}
	
	public void swap(){
		
	}
	
}
