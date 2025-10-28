class PriorityThread extends Thread
{
	PriorityThread(String name){
		super(name);
	}
	public void run(){
		try{
			for (int i=0;i<5 ;i++ )
			{
				System.out.println(getName()+" Working on :  "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}

class ThreadThree
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		PriorityThread pt1=new PriorityThread("High Priority");
		PriorityThread pt2=new PriorityThread("Medium Priority");
		PriorityThread pt3=new PriorityThread("Low Priority");
		
		pt1.setPriority(Thread.MAX_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY);
		pt3.setPriority(Thread.MIN_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();
	}
}
