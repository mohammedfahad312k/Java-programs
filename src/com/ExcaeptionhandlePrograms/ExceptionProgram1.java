package com.ExcaeptionhandlePrograms;

public class ExceptionProgram1 {
	
	public static void wakeup() {
		
//try //{
		System.out.println(10/0);
	
	//}
//catch(Exception e) {
	//System.out.println("please enter non zero number to execute this method");
//}
	}
	public static void sleep() {
		System.out.println("in sleep method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         sleep();
         
         try {
		wakeup();
		System.out.println("its main method of the program");
         }
         catch(Exception e) {
        	 System.out.println("excetion is handling in the main method");
         }
	}

}
