package com.fahadprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter the number");
		int num= s.nextInt();  //786
		
		//logic
		/*int rev=0;
		while(num!=0) {
			
			rev =rev*10 + num%10;  // 0*786=0 (+) 786%10=6   0+6=6
									//6*10=60   78%10=8       60+8=68
									//68*10=680   7%10=7		680+7=687
			
				num=num/10;	 //786/10=78  
								//78/10=7
								//7/10=0
				
		}*/
		//logic 2   using string method reverse the number
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		StringBuffer rev= sb.reverse();
		
		System.out.println("reverse number is:" +rev);
		

	}

}
