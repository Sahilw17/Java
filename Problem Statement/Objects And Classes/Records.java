//A college portal wants to maintain student records (roll, name, branch, marks). Implement class Student, take input of 5 students, and display toppers details.

import java.util.Scanner;

class Student 
{
	int rollno;
	String name;
	String branch;
	int marks;
	
	void accept(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rollno: ");
		rollno=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name: ");
		name=sc.nextLine();
		
		System.out.println("Enter the Branch: ");
		branch=sc.nextLine();
		
		System.out.println("Enter the Java Marks: ");
		marks=sc.nextInt();
	}
	void display(){
		System.out.println("Your Name is :"+name);
		System.out.println("Your Rollno is :"+rollno);
		System.out.println("Your Branch is :"+branch);
		System.out.println("Your Java Marks are :"+marks);
		System.out.println();
		}
}

class  Records
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Student s[]=new Student[5];
		for(int i=0;i<5;i++){
			s[i]=new Student();
			s[i].accept();
		}
		
		for(int i=0;i<5;i++){
			s[i].display();
		}
		
		int max=s[0].marks;
		int j=0;
		for(int i=1;i<5;i++){
			if(s[i].marks>max){
				max=s[i].marks;
				j=i;
			}
		}
		System.out.println("The Topper is : "+s[j].name);

		
	}
}
