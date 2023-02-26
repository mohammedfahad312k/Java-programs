package com.fahadprograms;
import java.util.*;

class deo
{
int x;

static int y;
//instance variable
{
x=10;
System.out.println("inside the instance block");
System.out.println(x);
}

//static block
static
{
int y=20;
System.out.println("inside the static block");
System.out.println(y);
}

//constructor same as class name
deo()
{
System.out.println("iniside the constructor ");
}


//instance block  it will execute before the constructor call..
{
System.out.println("welcome to java class");
}
}



public class sticblock {
	public static void main(String[] args)
	{
	deo s= new deo();
	
	
	}

}
