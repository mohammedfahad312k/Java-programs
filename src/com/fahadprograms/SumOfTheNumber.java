package com.fahadprograms;

public class SumOfTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {1,3,4,5,6,7};
		int sum=0;
		/*for(int i=0;i<=a.length-1;i++) {
			sum = sum+ a[i];
			
		}*/
		
		//using for each loop
		for(int i:a) {
			sum = sum+ i;
		}
 
		System.out.println("the sum of the number is"+ sum);
	}

}
