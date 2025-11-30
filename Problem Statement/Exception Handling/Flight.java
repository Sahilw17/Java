//Flight seat beyond limit  throw SeatUnavailableException.
class SeatUnavailableException extends Exception
{
	String st;
	SeatUnavailableException(String st){
		super(st);
	}
}

class Logic
{
	int seats=100;
	void SeatBook (int sno)throws SeatUnavailableException{
		if(sno>seats){
			throw new SeatUnavailableException("The Tickets are not avaliable!!!");
		}
		else{
			System.out.println("The Tickets are booked \nThe available tickets are :"+seats);
		}
	}
}
class  Flight
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Logic l=new Logic();
		try{
			l.SeatBook(140);
		}
		catch(SeatUnavailableException e){
			System.out.println(e.getMessage());
		}
	
	}
}
