package com.fahadprograms;

abstract class Plane
{

/*void takeOff()
{
System.out.println("plane is taking off");
}*/
abstract void fly();
}
class CargoPlane extends Plane
{
/*void takeOff()
{
System.out.println("Cargoplane is taking off");
}*/
void fly()
{
System.out.println("Cargoplane is flying with the low speed");
}

void CarryCargo()
{
System.out.println("Cargoplane is carrying the goods");
}
}


class PassengerPlane extends Plane
{
void fly()
{
System.out.println("Passengerplane is flying with the medium speed");
}
void CarryPassenger()
{
System.out.println("Passengerplane is carrying the people");
}
 
}
public class AbstractionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Plane p= new Plane();
     Plane p;
    p= new CargoPlane();
    p.fly();
     //p.takeOff();
    ((CargoPlane) (p)).CarryCargo();
     
	}

}
