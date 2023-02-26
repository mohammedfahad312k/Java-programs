package com.fahadprograms;

	class tap {
	String name ="fahad";
	int age = 20;
	
	static String college ="shaheen"; 
	//static variable
	
	
	public void fun() {
		System.out.println("my name is:"+name );
		System.out.println("my age is:"+age);
		System.out.println("my clg :"+college);
		
	}
void fun1() {
	
}

public class typesOfBlock {

	public static void main(String[] args) {
	
		   //instance variable
		
		
		
		tap ty= new tap();
		ty.fun();
		System.out.println(ty.college);
		System.out.println();
		
		
		ty.name = "mohammed";
		ty.age=50;
		System.out.println(ty.name);
		System.out.println(ty.age);
		
		System.out.println(ty.college);
		
		int a= 20;
		System.out.println(a);
		
	}
}
}
	
