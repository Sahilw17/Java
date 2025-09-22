abstract class Employee
{
	abstract void transportation();
	abstract void meals();
}

class Fulltime extends Employee
{
	final salary;
	Fulltime(int salary){
		this.salary=salary;
	}
	void transportation(){
		int trans=1500;
		salary=salary-trans;
	}
	void meal(){
		int meal=1500;
		salary=salary-meal;
	}
	void display_salary(){
		System.out.println("Total Salary=" + salary);
	}
}

class PartTime extends Employee
{
	
}
class  Emp
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
