//This one just creates two threads that print messages independently.

class MessagePrinter implements Runnable{
	String message;
	MessagePrinter(String message){
		this.message=message;
	}
	
	public void run(){
		try{
			for (int i=0;i<5 ;i++ )
			{
				System.out.println(Thread.currentThread().getName()+" Says:"+message+" - "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}

class  ThreadFour
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		MessagePrinter m1=new MessagePrinter("Men Don't Care");
		MessagePrinter m2=new MessagePrinter("Men are Strong");
		
		Thread t1=new Thread(m1,"Thread-1");
		Thread t2=new Thread(m2,"Thread-2");
		
		t1.start();
		t2.start();
	
	}
}
