class table
{
	synchronized void printtable(int num){
		try{
			for (int i=1;i<=10 ;i++ )
			{
				System.out.println(Thread.currentThread().getName()+" - "+num+" x "+i+" : "+num*i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}

class newtable extends Thread
{
	table t;
	int num;
	newtable(table t,int num){
		this.t=t;
		this.num=num;
	}
	
	public void run(){
		t.printtable(num);
	}
}



class Maths
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		table t=new table();
		
		newtable t1=new newtable(t,2);
		newtable t2=new newtable(t,5);
		
		t1.start();
		t2.start();
	
	}
}
