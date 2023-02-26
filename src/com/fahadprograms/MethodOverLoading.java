package com.fahadprograms;

class load{



int add(int x, int y)
{
return x+y;
}
float add(float x, float y)
{
return x+y;
}
double add(double x, double y)
{
return x+y;
}
float add(int x, float y)
{
return x+y;
}
double add(int x, double y)
{
return x+y;
}
double add(float x, double y)
{
return x+y;
}
float add(float x, int y)
{
return x+y;
}
double add(double x, int y)
{
return x+y;
}
double add(double x, float y)
{
return x+y;
}
int add(int x, int y, int z)
{
return x+y+z;
}
float add(float x, float y, float z)
{
return x+y+z;
}
double add(double x, double y, double z)
{
return x+y+z;
}
double add(int x, float y, double z)
{
return x+y+z;
}
float add(int x, float y, float z)
{
return x+y+z;
}
double add(int x, double y, double z)
{
return x+y+z;
}
float add(float x, int y, int z)
{
return x+y+z;
}
}

public class MethodOverLoading {
	
	public static void main(String []args) {
	load t =new load();
	
	int a=10, b=20,c=30;

	float x=50f,y=100,z=150;

	double p=2,q=4,r=6;

	System.out.println(t.add(p,q));
	System.out.println(t.add(a,x));
	System.out.println(t.add(x,y,z));
	System.out.println(t.add(a,p));
	}

}
