package com.CollectionPrograms;

import java.util.Arrays;

public class BobleSortProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []a={2,4,1,3,5};
		System.out.println("before sorting the element:" +Arrays.toString(a));
		
		
		for(int i=0;i<a.length-1;i++) {  // number of pass n-1
			
			for(int j=0;j<a.length-1;j++) { // iteration in each part
				
				if(a[j]>a[j+1]) {
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]= temp;
				}
				
			}
		}
		
		System.out.println("After sorting the element:" +Arrays.toString(a));
	}

}
