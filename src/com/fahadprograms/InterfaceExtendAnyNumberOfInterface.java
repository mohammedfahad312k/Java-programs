package com.fahadprograms;

interface calcualte4{
void add();
}
interface calculate5{
void sub();
}
interface calculate6 extends calcualte4,calculate5{
void mul();
}

abstract class calculator1 implements calculate6{
public void add(){
int a, b,c;
a= 10; 
b=20;
c=a+b;
System.out.println(c);
}
public void sub(){
int a, b,c;
a= 30; 
b=20;
c=a-b;
System.out.println(c);
}

abstract public void mul();
}

class mathamatic extends calculator1{

public void mul(){
int a, b,c;
a= 20; 
b=20;
c=a*b;
System.out.println(c);
}
}
public class InterfaceExtendAnyNumberOfInterface {
public static void main(String[]args){


mathamatic m = new mathamatic();
m.add();
m.sub();
m.mul();
}
}

