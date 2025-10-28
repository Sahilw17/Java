class Threadone extends Thread
{
	public void run(){
		try{
			for (int i=0;i<5 ;i++ )
			{
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}


class Threadtwo extends Thread
{
	public void run(){
		try{
			for (int i=5;i<10 ;i++ )
			{
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}

class  ThreadTwo
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Threadone t1= new Threadone();
		Threadtwo t2= new Threadtwo();
		t1.start();
		t2.start();
	}
}
