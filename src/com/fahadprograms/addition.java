package com.fahadprograms;

// program without object oriented features
import java.util.*;

class squareshape{
	float length;
	float area;
	
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

class Reactangle{
	
	float length;
	float area;
	float breadth;
	
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

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		squareshape s= new squareshape();
		s.input();
		s.compute();
		s.display();
		
		Reactangle r= new Reactangle();
		r.input();
		r.compute();
		r.display();

	}

}
