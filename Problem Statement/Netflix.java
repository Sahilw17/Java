class subover extends Exception
{
	subover(String message){
		super(message);
	}
}


class  Netflix
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		int day=0;
		for(int i=0;i<30;i++){
			day+=1;
		try{
			if(day<28)
				System.out.println("Remaning days: "+ (28-i));
			else
				throw new subover("Your Subscription is over!!!!");
		}
		catch(subover e){
			System.out.println(e);
		}
		}
	}
}
