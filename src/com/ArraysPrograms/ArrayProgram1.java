package com.ArraysPrograms;

public class ArrayProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;

/*	for(int i=0;i<=n;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}*/
		
		
		/*for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		for(int i=1;i<=n;i++){
			for(int sp=0;sp<n-i;sp++) {
				System.out.print(" ");
			}
			for(int s=0;s<i;s++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	
	

}
