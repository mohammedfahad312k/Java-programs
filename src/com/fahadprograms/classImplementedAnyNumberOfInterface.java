package com.fahadprograms;
interface calcualte1{
void add();
}
interface calculate2{
void sub();
}
interface calculate3{
void mul();
}

abstract class calculator implements calcualte1,calculate2,calculate3{
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

class math extends calculator {

public void mul(){
int a, b,c;
a= 10; 
b=20;
c=a*b;
System.out.println(c);
}
}

public class classImplementedAnyNumberOfInterface {

public static void main(String[]args){


math m = new math();
m.add();
m.sub();
m.mul();
}
}



