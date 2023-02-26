package com.fahadprograms;

public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*byte b=10;
		int i = b;
		System.out.println(i);*/
		
		/*char c='A';
		short s=c;
	System.out.println(c+" "+s);*/
		
		/*char c='A';
		int i=c;
		System.out.println(c+" "+i);*/
		
		
		//byte range from -128 to 127
		
		//implicit type casting
		byte b=127;
		int i=b;
		System.out.println(b);
		
		/*byte b1=60;
		byte b2=70;
		int b3=b1+b2;
		System.out.println(b3);*/
		
		
		//explicit type casting
		int x =1000;
		byte y=(byte)x ;
		System.out.println(y);
	}

}


