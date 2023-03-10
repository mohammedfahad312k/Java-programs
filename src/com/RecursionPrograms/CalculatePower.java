package com.RecursionPrograms;

public class CalculatePower {
	public static int power(int x, int n){
		//base case
		if(n==0) {
			return 1;
		}
		int smallOutput=power(x,n-1);
		int output= x*smallOutput;
		
		return output;
	}
	
	public static int numberOfDigits(int n) {
		if(n==0) {
			return 0;
		}
		int smallOutput= numberOfDigits(n/10);
		int output = 1+smallOutput;
		return output;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,3));
		System.out.println(numberOfDigits(46543377));

	}

}



