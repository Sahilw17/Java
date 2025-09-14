package pack2;
import pack1.Emp_Details;
import java.util.Scanner;

class sal
{
	Scanner sc=new Scanner(System.in);
	void tds(){
		Emp_Details det=new Emp_Details();
		System.out.println("Enter the working days in month: ");
		 int working_day=sc.nextInt();
		System.out.println("Enter the  actual working days in month: ");
		 int actual_day=sc.nextInt();
		 int tds1=(det.salary / working_day)*actual_day;
		System.out.println("TDS= "+tds1);
	}
	
	void gross(){
		Emp_Details det=new Emp_Details();
		 int hra=9000;
		 int trans_allo=1700;
		 int bonus=1600;
		 int gross=(det.salary+hra+trans_allo+bonus);
		System.out.println("Gross: "+gross);
	}
}

class Salary
{
	public static void main(String[] args) 
	{
		Emp_Details emp=new Emp_Details();
		emp.accept_details();
		sal s=new sal();
		System.out.println("Name: "+emp.emp_name);
		s.tds();
		s.gross();
		
	}

}