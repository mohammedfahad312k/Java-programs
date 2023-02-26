package com.ExcaeptionhandlePrograms;
import java.util.*;
public class ExceptionProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// single try block and multiple catch block
		
		Scanner s= new Scanner (System.in);
		System.out.println("enter the value of A:");
		int a=s.nextInt();
		
		System.out.println("enter the value of B:");
		int b=s.nextInt();
		try {
		System.out.println("the result is:"+ " " +(a/b));
		}
		
		
		
		catch(ArithmeticException e ) {
			System.out.println("learn the math..1");
			
		}
		
		catch(InputMismatchException e) 
		{
			System.out.println("plz enter valid number");
		}

		catch(Exception e) {
		System.out.println("invalid ");
		
	}
		
	}
	

}
