//ATM  withdraw should throw custom exception InsufficientBalanceException if balance < withdraw amount.

class InsufficientBalanceException extends Exception
{
	String st;
	InsufficientBalanceException(String st){
		super(st);
	}
}

class Logic
{
	int balance=50000;
	public void withdraw(int amt) throws InsufficientBalanceException {
		if(amt>balance){
			throw new InsufficientBalanceException("The Balance is low!!!");
		}
		else{
			balance-=amt;
			System.out.println("The Reamining Balance is :"+balance);
		}
	}
}

class ATM 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Logic l=new Logic();
		try{
			l.withdraw(60000);
		}
		catch(InsufficientBalanceException e){
			System.out.println(e.getMessage());
		}
	}
}
