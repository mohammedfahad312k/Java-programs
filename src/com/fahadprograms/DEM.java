package com.fahadprograms;

class V
{
int k =10; // parent class or super class
}
class B 
{
int k = 20;
}
class C extends A{
	
	int k=100;
}
class DEM
{
public static void main(String[] args)
{
C c= new C();
DEM d= new DEM();
System.out.println(c.k);
System.out.println(c.k);
System.out.println(c.k);

}



}
