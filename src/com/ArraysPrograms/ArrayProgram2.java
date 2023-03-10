package com.ArraysPrograms;

public class ArrayProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = {1,2,3,4,5};
		int length = a1.length;
		System.out.println(length);
		
		int  a2[]= new int[length];
		for(int i= length-1; i>=0; i--) {
		System.out.print(a1[i] + " ");
		}
		System.out.println();
		
		for(int value: a1) {
			System.out.print(value+" ");
		}
		for(int i=length-1;i>=0;i--) {
			a2[length-i-1]=a1[i];
		}
		System.out.println();
		for(int value:a2) {
			System.out.print(value);
		}
		
		int n=a1.length;
		for(int i=0;i<=(n-1)/2;i++) {
			int temp=a1[i];
			a1[i]=a1[n-1-i];
			a1[n-1-i]=temp;
		}
		for(int value:a1) {
			System.out.print(value);
		}
		
	}

}
