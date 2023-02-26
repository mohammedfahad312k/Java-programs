package com.fahadprograms;

import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the number");
		int num=sc.nextInt();//16461
		
		int org_num= num;
		int rev=0;
		while(num!=0) {
			
			rev =rev*10 + num%10;  
			
			
				num=num/10;	 
		}       
		
		//System.out.println(rev);
		if(org_num==rev) {
			System.out.println(org_num+":the number is palindrom");
			
		}
		else {
			System.out.println(org_num+": the number is not a palindrome");
		}
	}

}
 