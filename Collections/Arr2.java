//Store Students in ArrayList

import java.util.*;
class Student
{
	int rollno;
	String name;
	
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
}

class  Arr2
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		ArrayList<Student>s=new ArrayList<>();
		
		s.add(new Student(1,"Sahil"));
		s.add(new Student(2,"Ritesh"));
		s.add(new Student(3,"Gaurav"));
		s.add(new Student(4,"Adtiyaa"));
		
		for(Student q : s){
			System.out.println(q.name+" : "+q.rollno);
		}
	}
}
