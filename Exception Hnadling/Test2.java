import java.util.Scanner;

class YoungerAgeException extends Exception
{
	YoungerAgeException(String message){
		super(message);
	}
}

class Test2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		try{
			if(age <18){
				throw new YoungerAgeException("Abbhi Chota hai bhai tu");
			}
			else{
				System.out.println("You are Eligible!");
			}
		}
		catch(Exception e){
			System.out.println("Exception= "+e.getMessage());
		}
	}
}
