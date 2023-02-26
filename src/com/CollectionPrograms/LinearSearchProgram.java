package com.CollectionPrograms;

public class LinearSearchProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,400,30,70,50,40};
		
		int search_element=40;
		boolean flag= false;
		for(int i=0;i<a.length;i++) {
			if(search_element==a[i]) {
				System.out.println("element is found at:" +i);
				flag= true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("element is not found");
		}
	}
}
