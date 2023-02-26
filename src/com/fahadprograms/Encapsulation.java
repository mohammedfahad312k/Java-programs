package com.fahadprograms;


class student{
	private String name;
	private int age;
	private int marks;
	
	public void setdata(String name,int age,int marks) {
		this.name=name;
		this.age=age;
		this.marks= marks;
	}
	public String  getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public int getmarks() {
		return marks;
		
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s= new student();
		s.setdata("fahad",22,99);
		System.out.println(s.getname());
		System.out.println(s.getage());
		System.out.println(s.getmarks());

	}

}
