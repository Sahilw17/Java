package pack1;
import java.util.Scanner;
public class Emp_Details
{
	public String emp_name;
	public int salary;
	public String pos;
	
	public void accept_details(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		emp_name=sc.nextLine();
		System.out.println("Enter the salary: ");
		salary=sc.nextInt();
		System.out.println("Enter the position: ");
		pos=sc.nextLine();
	}
}