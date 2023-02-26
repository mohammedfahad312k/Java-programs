package com.fahadprograms;
import java.util.*;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("enter the string :");
		String s1=s.next();
		
		String s2= "";
		
		int len=s1.length();
		for(int i=len-1;i>=0;i--) {
			s2= s2+s1.charAt(i);
			
		}
		System.out.println(s2);
		String orginal_string=s1;
		if(orginal_string.equals(s2)) {
			System.out.println("given String is palindrome String:"+ orginal_string);
		}
		else {
			System.out.println("not a palindrome strig:"+orginal_string);
		}
		
	}

}
