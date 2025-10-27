class MembershipExpiryException extends Exception
{
	MembershipExpiryException(String msg){
		super(msg);
	}
}

class Membership
{
	void MembershipExpiry(String type) throws MembershipExpiryException{
		int i;
			for (i=0;i<=365 ;i++ )
			{
				System.out.println("Day: "+i);
				if(i==30 && type=="monthly"){
					throw new MembershipExpiryException("Sir your Monthly Membership is over");
				}
				
				else if(i==182 && type=="halfyear"){
					throw new MembershipExpiryException("Sir your Half Year Membership is over");
				}
				else if(i==364 && type=="anual"){
					throw new MembershipExpiryException("Sir your Anual Membership is over");
			}
		}
	}
}

class  OttCustomer
{
	public static void main(String[] args) 
	{
		String type="halfyear";
		Membership mb=new Membership();
		try{
			mb.MembershipExpiry(type);
		}
		catch(MembershipExpiryException me){
			System.out.println(me.getMessage());
		}
	}
}
