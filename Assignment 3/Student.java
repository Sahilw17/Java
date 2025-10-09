import java.util.Scanner;
class stud
{
	int rollno;
	String name;
	
	stud(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	} 
	void display(){
		System.out.println("Name: "+name+"rollno: "+rollno);
	}
}
class  Student
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Scanner sc=new Scanner(System.in);
		stud[] s=new stud[5];
		for (int i=0;i<s.length ; i++)
		{
			System.out.println("Enter the rollno and name");
			int roll=sc.nextInt();
			String name=sc.nextLine();
			s[i]=new stud(roll,name);
		}
		
		for (stud ss : s  )
		{
			ss.display();
		}
	}
}
