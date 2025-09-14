class College
{
	String name;
	String course;
	int code;
	
	college(int code,String name,String Course){
		this.code=code;
		this.name=name;
		this.course=course;
	}
	
	getcode(){
		System.out.println("The code is : "+code);
	}
	
	getname(){
		System.out.println("The name is : "+name);
	}
	getcourse(){
		System.out.println("The course is : "+course);
	}
}



class CollegeData
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
