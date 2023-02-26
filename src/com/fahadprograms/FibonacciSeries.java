package com.fahadprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("eneter the numner");
		int num=s.nextInt();
		
		int n1=0,n2=1, sum=0;
		
		for(int i=2;i<num;i++) {
			sum = n1+n2;
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;
		}
	
			
			//

	}

}
