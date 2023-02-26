package com.fahadprograms;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//fctorial 5!= 1*2*3*4*5= 120
		//fctorial 5!= 5*4*3*2*1= 120
		int num=10;
		long Factorial=1;
		for(int i=num;i>=1;i--) {
			Factorial= Factorial * i;
		}
		
		System.out.println("the factorial of a given number: " +Factorial);
	}
	

}
