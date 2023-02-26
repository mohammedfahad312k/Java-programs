package com.fahadprograms;

class Business{
	void selling(){
		System.out.println("Business is happening");   // inherited method
	}
}
class RealState extends Business {
	void selling() {
	System.out.println("realState business is happening very low");   //overriddingmethod
}
	void banking() {
		System.out.println("banking is doing");               // specialized method
	}
}
class Investment extends Business{
	
	void selling() {
	System.out.println("invetment business is happening at mediam level");
}
	void professor() {
		System.out.println("teaching in collge");
	}
}
class Product extends Business{
	void selling() {
		System.out.println("product selling business at very peak level");
	}
	void store() {
		System.out.println("having own provision store");
	}
}

public class PrentReferenceToChildObjectPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stubsi
		
		Business B= new Business();     //parent class object creation with reference type B
		B.selling();
		System.out.println();
		
		B= new RealState();            // using parent reference creating child object
		B.selling();                    //overridden method
		((RealState)(B)).banking();                //speacialzed method
		System.out.println();
		
		
		B=new Investment();             //upcasting
		B.selling();                    //upcasting
		((Investment)(B)).professor();   //downcasting
		System.out.println();
		
		B= new Product();        //Upcasting
		B.selling();
		((Product)(B)).store();  //Downcasting
		System.out.println();

	}
	

}
