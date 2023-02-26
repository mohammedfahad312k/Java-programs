package com.fahadprograms;
import java.util.*;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		System.out.println("please enter the number");
		int num=s.nextInt();
		
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
          System.out.println("the number of digits is :" +count);
		
		
	}

}
