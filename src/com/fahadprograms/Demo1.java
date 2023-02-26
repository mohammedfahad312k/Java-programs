package com.fahadprograms;
class Test
{
	
	
	//insance method
void fun1()
{
System.out.println("inside the instance method");
}


//static method no need to create object directly we can call using class name.
static void fun2()
{
System.out.println("inside the static method");
}
}


public class Demo1 {
	public static void main(String[] args)
	{
	Test t1 =new Test();
	t1.fun1();
	//t1.fun2();
	Test.fun2();
	}
	}


