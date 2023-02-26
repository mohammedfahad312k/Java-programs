package com.fahadprograms;

import java.util.Scanner;

public class largestThreenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("enetr the first number:");
		int a=s.nextInt();

		System.out.println("enetr the first number:");
		int b=s.nextInt();
		
		System.out.println("enetr the first number:");
		int c=s.nextInt();
		
		int large1=a>b?a:b;   // largest of a and b
		int large2=c>large1?c:large1;   // largest of larger and c
		System.out.println(large2+  " "+" is the largest of given 3 number");
		 
		
	}

}
