/*
A flight booking system must:

Verify that the passenger age is valid (no negative or zero values).

Check that the seat number is available (must be between 1 and 150).
If any of these validations fail, the system should throw custom exceptions using the throws keyword.

*/

class AgeVerifyException extends Exception
{
	AgeVerifyException(String message){
		super(message);
	}
}

class SeatAvaliableException extends Exception
{
	SeatAvaliableException(String message){
		super(message);
	}
}

class booking 
{
	void AgeCheck(int age) throws AgeVerifyException{
		if(age<0){
			throw new AgeVerifyException("You are not of valid age");
		}
		else{
			System.out.println("You are eligible in terms of age");
		}
	}
	
	void SeatCheck(int seatnumber) throws SeatAvaliableException{
		if(seatnumber>1 && seatnumber<150){
			System.out.println("The Seat is availiable");
		}
		
		else{
			throw new SeatAvaliableException("Seat is not in the  flight");
		}
		
	}
}


class Flight
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		int age=-3;
		int seatnumber=153;
		booking b=new booking();
		try{
			b.AgeCheck(age);
		}
		catch(AgeVerifyException av){
			System.out.println(av.getMessage());
		}
		
		try{
			b.SeatCheck(seatnumber);
		}
		catch(SeatAvaliableException sa){
			System.out.println(sa.getMessage());
		}
	}
}
