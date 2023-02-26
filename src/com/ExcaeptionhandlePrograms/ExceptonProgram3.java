package com.ExcaeptionhandlePrograms;

public class ExceptonProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=2;
		//System.out.println("A:" );
		
		//System.out.println("B:";
		try {
		System.out.println(a/b);
	
		}
		catch(Exception e) {
			System.out.println("invalid");
		}
		
		finally {
			System.out.println("program is executed..!");
		}
	}
	

}
