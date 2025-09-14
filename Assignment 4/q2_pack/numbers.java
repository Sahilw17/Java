package pack1;
import java.util.Scanner;
public class numbers
{
	public int num1;
	public int num2;
	
	  public void accept_number(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number 1:");
		num1=sc.nextInt();
		System.out.println("Enter the Number 2:");
		num2=sc.nextInt();
	}
	
	public void operations()
	{
		System.out.println("Addition= "+(num1+num2));
		System.out.println("Substraction= "+(num1-num2));
		System.out.println("Multiplication= "+(num1*num2));
		System.out.println("Division= "+(num1/num2));
		System.out.println("Remainder= "+(num1%num2));
		
	}
	
}
