package com.fahadprograms;


class person{
	private String  name;
	private int age;
	 private static String school = "shsheen";
	
	person (String name,int age){
		this.name = name;
		this.age= age;
	}
	person(int age){
		this.age= age;
	}
	
	String getName() {
		return name;
		
	}
	int getAge() {
		return age;
	}
	
	String getSchool() {
		return school;
	}
}


public class constor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p= new person("mohammed Fahad", 20);
	
		System.out.println(p.getName());
		System.out.println(p.getAge());



	}

}
