package com.fahadprograms;

import java.util.Scanner;

//WAP to store and print marks of n number of students

//WAP to store and sum the values and print sum value.

public class SingleArray1 {

	public static void main(String[] args) {
		
		int sum=0;
		
		System.out.println("enter the n number of array:");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		int a[]= new int[n];
		System.out.println("the length of the array is: "+a.length);
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println("eneter the student marks:");
			a[i]= s.nextInt();
			
			
			
		}
		for(int i=0;i<=a.length-1;i++) {
			sum = sum+a[i];
			System.out.println(a[i] + " ");
		}
		System.out.println("the total sum of the student marks is:" +sum);
	}

}
