package com.fahadprograms;

import java.util.Scanner;

// The number should me natural number > 1
// Which has only 2 factors 1 and itself

//eg: 19--> 1 and 19 will divide
//eg: 28--> 1,2,4,7,14, 28 will divide

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("please enter the number");
		int num=s.nextInt();
		
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
				count++;
			}
		
			if(count==2) {
				System.out.println("it is a prime number");
			}
			else {
				System.out.println("not a prime number");
			}
	
		}
		
		else {
			System.out.println("plesae enetr the number greaterthan 0");
		}

	}
}

