package com.fahadprograms;

class school
{
private String name;
private int age;
private static  float height;// static variable
void setName(String sname)
{
name=sname;
}
void setAge(int sage)
{
age=sage;
}
void setHeight(float sheight)
{
height=sheight;
}
String getName()
{
return name;
}
int getAge()
{
return age;
}
float getHeight()
{
return height;
}
}
class college
{
public static void main(String[] args)
{
school s = new school();
s.setName("Subbu");
s.setAge(24);
s.setHeight(6.1f);
System.out.println(s.getName());
System.out.println(s.getAge());
System.out.println(s.getHeight());

System.out.println();
school s1 = new school();
s1.setName("fahad ");
s1.setAge(55);
//s1.setHeight(6.1f);
System.out.println(s1.getName());
System.out.println(s1.getAge());
System.out.println(s1.getHeight());
}
}