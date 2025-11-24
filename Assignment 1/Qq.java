class parent
{
	int add(int a,int b){
		 c=a+b;
		return a+b;
	}
}
class child extends parent
{
	int add(int a,int b){
		 c=a-b;
		return c;
	}
}


class Qq
{
	static int add(int a,int b){
		 c=a+b;
		return a+b;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(c);
		
		
	}
}








abstract class bankacc
{
	abstract void withdraw();
	abstract void deposit();
}

class saving extends bankacc
{
	void withdraw(){
		balance=balance-withdrawamount;
	}
	void deposit(){
		balance=balance+depositamount;
	}
}




abstract class animal
{
	abstract void eat();
	abstract void voice();
	abstract void vegnon();
}

class dog extends animal
{
	void eat(){
		sop("pedigree");
	}
	
	void voice(){
		sop('bark');
	}
	
	void vegnon(){
		sop('non')
	}
}


abstract class employeee
{
	abstract void accept();
	abstract void display();
}

class manager extends employee
{
	void accept(){}
	void display(){}
}
class workre extends emplyee
{
	void accept(){}
	void display(){}
}

interface  order
{
	 void accept();
	 void dsiplay();
}

class puro implements order
{
	String custname;
	public void accept(){}
	public void display(){}
}
