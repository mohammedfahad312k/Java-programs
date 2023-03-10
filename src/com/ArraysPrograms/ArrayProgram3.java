package com.ArraysPrograms;

public class ArrayProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag= false;
		int a[]= {1,2,2,3,3,4};
		int n=a.length;
		System.out.println(n);
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					flag= true;
				
				}
			}
		}
	}

}
