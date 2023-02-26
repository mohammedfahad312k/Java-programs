package com.fahadprograms;

import java.util.Scanner;

//WAP to store and print marks of 5 students.

public class SingleArrays {
	public static void main(String[]args) {
		int a[]= new int[5];
		Scanner s= new Scanner(System.in);
		
		
		//using for loop
		
		/*for(int i=0;i<=4;i++) {
			System.out.println("eneter the student marks: ");
			a[i]= s.nextInt();
		}
		
		for(int i=0;i<=4;i++) {
			System.out.print(a[i] +" ");
		}*/
		
		//using while loop
		
		int i=0;
		while(i<=4) {
			System.out.println("eneter the student marks: ");
			a[i]= s.nextInt();
			i++;
		}
		i=0;
		while(i<=4) {
			System.out.print(a[i] +" ");
			i++;
			
		}
	
	}

}
