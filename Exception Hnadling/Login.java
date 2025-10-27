class LengthException extends Exception
{
	LengthException(String msg){
		super(msg);
	}
}

class OnlyAplaException extends Exception
{
	OnlyAplaException(String msg){
		super(msg);
	}
}

class Password
{
	void CheckPass(String pass) throws LengthException,OnlyAplaException{
		if(pass.length()<8){
			throw new LengthException("The length must be more than 8 characters");
		}
		if(pass.matches("[a-zA-Z]+")){
			throw new OnlyAplaException("The password must conatian a number and special character");
		}	
	}
}

class Login
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		String pass="1sahilwaghole";
		Password ps=new Password();
		try{
			ps.CheckPass(pass);
			System.out.println("Login Sucessfully");
		}
		catch(LengthException le){
			System.out.println(le.getMessage());
		
		}
		catch(OnlyAplaException oa){
			System.out.println(oa.getMessage());

		}
	}
}
