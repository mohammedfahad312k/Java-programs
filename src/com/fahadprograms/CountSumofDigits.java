package com.fahadprograms;

import java.util.Scanner;

public class CountSumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enetr the number:");
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		int sum=0;

		while(num!=0) {
		sum=sum+num%10;
		num=num/10;
	}
	System.out.println("the total number is "+sum);

	}

}
