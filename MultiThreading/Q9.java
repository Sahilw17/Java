class Q1AMultiTh extends Thread
{
	public void run(){
		try{
			for (int i=0;i<30 ;i++ )
			{
				System.out.println("Hello");
				Thread.sleep(1000);
			}
			
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
	}
}

class Q1BMultiTh extends Thread
{
	
	public void run(){
		try{
			for (int i=0;i<10 ;i++ )
			{
				Thread.sleep(2000);
				System.out.println("Wear MAsk");
			}
			
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
	}
}


class Q1CMultiTh extends Thread
{
	
	public void run(){
		try{
			for (int i=0;i<5 ;i++ )
			{	
				Thread.sleep(5000);
				System.out.println("Use Santizer");
			}
			
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
	}
}

class  Q9
{
	public static void main(String[] args) 
	{
			
		Q1AMultiTh pt1=new Q1AMultiTh();
		Q1BMultiTh pt2=new Q1BMultiTh();
		Q1CMultiTh pt3=new Q1CMultiTh();

		
		//pt1.setPriority(Thread.MAX_PRIORITY);
		//pt2.setPriority(Thread.MIN_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();

	}
}