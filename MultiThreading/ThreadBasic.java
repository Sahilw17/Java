class Mythread extends Thread
{
	public void run(){
		for (int i=0;i<15 ;i++ )
		{		
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}

class  ThreadBasic
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Mythread t1= new Mythread();
		Mythread t2= new Mythread();
		t1.start();
		t2.start();
	}
}
