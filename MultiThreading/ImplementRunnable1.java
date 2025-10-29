class MyRunnable implements Runnable 
{
	public void run(){
		try{
			for (int i=0;i<6 ;i++ )
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

class  ImplementRunnable1
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		MyRunnable r=new MyRunnable();
			
		Thread t1=new Thread(r,"worker-1");
		Thread t2=new Thread(r,"worker-2");
		
		t1.start();
		t2.start();
	}
}
