package com.CollectionPrograms;

public class BinarySearchProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {10,20,30,40,50,60,70};
		int low=0;
		int high= a.length-1;
		int mid;
		
		boolean flag= false;
		int key = 504;
		while(low<=high) {
			mid= (low+high)/2;
			if(a[mid]==key) {
				System.out.println("element is found...!");
				flag= true;
				break;
			}
	
		
		if(a[mid]<key) {
			low=mid+1;
		}
		
		if(a[mid]>key) {
			high= mid-1;
		}
		}
	
		if(flag==false) {
			System.out.println("element is not found..!");
		}
		
	}
}
