package com.fahadprograms;

import java.util.Scanner;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter the number:");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt(); //1234
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {
		
			// "%" modulo operator is used for reminder  or extract the number
			int rem=num%10;
			if(rem%2==0) {
				even_count++;
				System.out.println(num);
			}
			else {
				odd_count++;
			}
			
			// eliminate the number after the 1st iteration
			num=num/10;
		}
	
System.out.println("the even number count is:"+even_count);
System.out.println("the odd number count is:"+odd_count);
	}

}
