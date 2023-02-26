package com.fahadprograms;


class parent{
	static String work="gym workout";        //parent static  variable
	  String duty="software  developer";          //parent instance variable
	
	static {
		System.out.println("parent 1st static block");      //static block of parent class
	}
	
	{
		System.out.println(" 1st instance block of parent class");          //instance variable
	}
	
	{
		
		System.out.println("2nd instance block of a parent class");          //instance variable
	}
	
	parent(){
		System.out.println("parent class constructor");          // constructor
	}
	
	static void work() {
		System.out.println("parent class 1st static method:"+work);        //parent class static method
	}
	
	void duty() {
		System.out.println("parent class 1st instance method:"+duty);      //parent class instance method
	}
	
	
}

class child extends parent{
	
	  int marks = 99;             //child class instance variable
	static String result = "pass";            //child class static variable
	
	
	static {
		System.out.println("child 1st static  block ");
	}
	
	{
		System.out.println("1st instance block of a child class");
	}
	
{
		
		System.out.println("2nd instance block of a child class");          //instance variable
	}
	
	child(){
		System.out.println("child class cinstructor");             //child constructor
	}
	
	static void studying() {
		System.out.println("child class 1st  static method:"+result);           //static method 
	}
	
	void marks() {
		System.out.println(" child class 1st  instance method:"+marks);        // instance method
	}
}

public class InstanceAndStaticMemberInInheritance {

	public static void main(String[] args) {
		System.out.println("main method");
		// TODO Auto-generated method stub
		child.studying();              //to call static method no need to cerate object reference
		child.work();
		
		//child class object reference
		child c= new child();
		
		//to access child class method which is instance method creation of object reference is compulsory
		c.duty();
		c.marks();
		
	}

}
