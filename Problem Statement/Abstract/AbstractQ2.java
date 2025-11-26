//Create an abstract class RideBooking (pickup, drop, calculateFare). Implement for Cab, Auto, and Bike.

abstract class RideBooking
{
	abstract void pickup();
	abstract void drop();
	abstract void calcfare();
}

class Cab extends RideBooking
{
	void pickup(){
		System.out.println("Your Pickup loc is : Sadashiv Peth");
	}
	void drop(){
		System.out.println("Your drop loc is: Uske Dil me!!");
	}
	void calcfare(){
		System.out.println("Your total money is your infinte efforts! ");
	}
}

class Auto extends RideBooking
{
	void pickup(){
		System.out.println("Your Pickup loc is : Pune");
	}
	void drop(){
		System.out.println("Your drop loc is: Mumbai");
	}
	void calcfare(){
		System.out.println("Your total money is your 1500 ");
	}
}
class Bike extends RideBooking
{
	void pickup(){
		System.out.println("Your Pickup loc is : Karvenagar");
	}
	void drop(){
		System.out.println("Your drop loc is: Delhi");
	}
	void calcfare(){
		System.out.println("Your total money is 70 ");
	}
}

class  AbstractQ2
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Cab c=new Cab();
		Auto a=new Auto();
		Bike b=new Bike();
		
		c.pickup();
		c.drop();
		c.calcfare();
		
		
		a.pickup();
		a.drop();
		a.calcfare();
		
		
		b.pickup();
		b.drop();
		b.calcfare();
	}
}
