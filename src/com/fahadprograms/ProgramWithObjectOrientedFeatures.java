package com.fahadprograms;

import java.util.Scanner;

abstract class shape{
	float length;
	float  area;
	float breadth;
	
	// 100% abstraction acheing 
	abstract void input();
	abstract void compute();
	abstract void display();
}

// concept of inheritance
class square extends shape{
	
	void input() {
	Scanner s = new Scanner (System.in);
	System.out.println("enter the length of the square:");
	length= s.nextFloat();
	 
	}
	void compute() {
		 area = length * length;
	}
	
	void display() {
		System.out.println("the area of sqaure is: " +area);
	}
}
	

class recatangle extends shape{
	
	void input() {
		Scanner s= new Scanner (System.in);
		System.out.println("enter the length of the rectangle");
		length = s.nextFloat();
		
		System.out.println("enter the breadth  of the rectangle");
		breadth = s.nextFloat();
		
		}
		void compute() {
			area = length * breadth;
		}
		
		void display() {
			System.out.println("the area of the rectangle is:" +area);
		}
	}

/*class math{
	void allow(shape ref) {
		ref.input();
		ref.compute();
		ref.display();
	}
}*/


public class ProgramWithObjectOrientedFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//math m= new math();
		//square s= new square();
		//recatangle r= new recatangle(); 
		//m.allow(s);
	    //m.allow(r);
		
		
		// acheving polymorphism
		shape s;
		s= new square();
		s.input();
		s.compute();
		s.display();
		System.out.println();
		
		s= new recatangle();
		s.input();
		s.compute(); 
		s.display();
		
		

	}

}
