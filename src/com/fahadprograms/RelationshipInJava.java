package com.fahadprograms;


class OperatingSystem{

	String name;
	int price;
	
	public OperatingSystem(String name, int price){
		this.name=name;
		this.price= price;
	}
	public String getname(){
		return name;
	}
	public int getprice(){
		return price;
		
	}
}
	

	 class Charger{
		 String brand;
		 int price;
		 
		 public Charger(String brand, int price) {
			 this.brand= brand;
			 this.price=price;
		 }
		 String getbrand(){
			 return brand;
		 }
		int getPrice(){
			 return price;
		}
	 }
	 
			
			
class Mobile{
	
	OperatingSystem os= new OperatingSystem("windows",5000);  //strong relationship
	
	void hasA(Charger c1) {                                       // weak relationship
		System.out.println(c1.getbrand());
		System.out.println(c1.getPrice());
	}
	
	
}
public class RelationshipInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m= new Mobile();
		Charger c1 = new Charger("samsung",500);
		
		m=null;


		System.out.println(m.os.getname());
		System.out.println(m.os.getprice());
		m.hasA(c1);
		
		//OperatingSystem.out.println();

		
		System.out.println(c1.getbrand());
		System.out.println(c1.getPrice());
	}

}
