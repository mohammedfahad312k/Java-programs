package com.fahadprograms;

class Airoplane{
	String name;
	String type;
	
	void takeOff() {
		System.out.println("plane is taking Off from the airport");  //inherited method
	}
	
	void fly() {
		System.out.println("plane is flying in the sky");   //overridden method
		
	}
	void land() {
		System.out.println("plane is landing successfully");
		
		System.out.println();
	}
}
	class passangerPlane extends Airoplane{
		void fly() {
			System.out.println("passangerPlane is flying in normal speed");  // overriding method
		}
		
		void carryingpassanger() {
			System.out.println("passanger plane carrying passanger from to the destination");   //specialized method
			
			System.out.println();
		}
		
	}
		
		class fighterPlane extends Airoplane{
			
			void fly() {
				System.out.println("fighter plane is flying very high speed in the sky");
			}
			
			void carryingArms() {
				System.out.println("fighter plane carrying arms to fught ");
				System.out.println();
			}
		}
		
		
	/*	class plane {
			void allow(Airoplane r) {
				r.fly();
				r.takeOff();
				r.land();
				//r.carryingpassanger();
				//r.carryingArms();
			}
		}*/
	

public class InheritedMethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//plane p = new plane();
		Airoplane ap= new Airoplane();
		
		ap= new passangerPlane(); 
		ap.fly();
		((passangerPlane) (ap)).carryingpassanger();
		ap.takeOff();
		ap.land();
		
		ap = new fighterPlane();
		//p.allow(fp);
		//p.allow(fp);
		
		
		ap.fly();
		((fighterPlane)(ap)).carryingArms();
		ap.takeOff();
		ap.land();
		
	
	}

}
