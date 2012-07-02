package com.ap.sorting;

public class MergeSort {
	
	public static void mergeSort(int a[],int i,int j){
		System.out.println("Value of i and j is :"+i+" "+j);
		if(i>=j) return;
		int mid = (i+j)/2;
		mergeSort(a,i,mid);
		mergeSort(a,mid+1,j);
		merge(a,i,j);
	}
	
	public static void merge(int a[],int i,int j){
		System.out.println("Value of i and j in MERGE is :"+i+" "+j);
		int size = j-i+1;
		int[] temp = new int[size];
		int count =0;
		int mid = (i+j)/2;
		int l=i;
		int r=mid+1;
		
		while(l<=mid&&r<=j){
			if(a[l]<=a[r])
				temp[count++]=a[l++];
			else
				temp[count++]=a[r++];
		}
		System.out.println();
		if(l>mid){
			while(r<=j){
				temp[count++]=a[r++];
			}
		}
		else if(r>j){
			while(l<=mid){
				temp[count++]=a[l++];
			}
		}
		int start=0;
		for(int count1 =i;count1<=j;count1++){
			a[count1]=temp[start++];			
		}
		
	}
}
