package com.fahadprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s1= "FAHAD";
		//String rev="";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the String");
		String s1=sc.next(); //fahad
		String org_str= s1;
		String rev= "";  //null 
		
		/*int len=s1.length();  // 5
		          		//5>=0
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+s1.charAt(i);
		}
			System.out.println(rev);*/
		
		char ch[]= s1.toCharArray();    
		//5
		int len= ch.length;
		
		for(int i= len-1;i>=0;i--)
		{
			rev= rev+ch[i];
		} 
		
		System.out.println(rev);
	
		
		
		
		/*StringBuffer sb= new StringBuffer(s1);
		System.out.println(sb.reverse());*/
	}

}
