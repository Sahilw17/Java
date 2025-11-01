class Bankaccount
{
	int balance=10000;
	
	synchronized public void withdraw(int amount){
		if(balance>=amount){
			System.out.println(Thread.currentThread().getName()+" is withdrawing rs."+amount);
			balance=balance-amount;
			System.out.println(Thread.currentThread().getName()+" withdraw Successful!");
			System.out.println(Thread.currentThread().getName()+" The Reamining amount is : "+balance);
		}
		else{
			System.out.println(Thread.currentThread().getName()+"The balance is insufficient to withdraw");
		}
	}
}

class Customer extends Thread
{
	Bankaccount acc;
	Customer(String name,Bankaccount acc){
		super(name);
		this.acc=acc;
	}
	
		public void run(){
			acc.withdraw(700);
		}
}


class  BankDemo
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Bankaccount acc=new Bankaccount();
		
		Customer t1=new Customer("Reyna",acc);
		Customer t2=new Customer("Omen",acc);
		
		t1.start();
		t2.start();
		
	}
}
