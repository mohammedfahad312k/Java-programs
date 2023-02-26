package com.fahadprograms;

class A
{
A()
{
System.out.println("inside the default constructor");
}
{
	
System.out.println("inside the instance block 1");
}
A(int x)
{
System.out.println("inside the parametrized constructor 1");
}
{
System.out.println("inside the instance block 2 ");
}
A(int y, String name)
{
System.out.println("inside the parametrized constructor 2");
}}



public class Demo2 {
	public static void main(String []args)
	{
		A a =new A();
		A c =new A(20);
		
		
		A b =new A(20,"fahad");
		
		}

}