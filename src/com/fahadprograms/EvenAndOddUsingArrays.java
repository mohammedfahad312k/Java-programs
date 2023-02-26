package com.fahadprograms;

public class EvenAndOddUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(a.length);
		
		System.out.println("all the even number from the array:");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}

		System.out.println("all the odd numbers from the array:");
		for(int i=0;i<a.length;i++) {
		if(a[i ]%2!=0) {
			System.out.println(a[i]);
		}
			
		}
		
		
		//using for each loop or enhanced loop
		
		/*System.out.println("all the even number from the array:");
		for(int even:a) {
			if(even%2==0) {
				System.out.println(even);
			}
		}
		
		
		System.out.println("all the odd numbers from the array:");
		for(int odd:a) {
			if(odd%2!=0) {
				System.out.println(odd);
			}
		}*/ 
		 
	}
	

}
