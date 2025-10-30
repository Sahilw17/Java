class Q1AMultiTh extends Thread
{
	int n;
	String msg;
	Q1AMultiTh(int n,String msg){
		this.n=n;
		this.msg=msg;
	}
	public void run(){
		try{
			for (int i=0;i<n ;i++ )
			{
				System.out.println(msg);
				Thread.sleep(500);
			}
			
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
	}
}

class Q1BMultiTh extends Thread
{
	
	int n;
	String msg;
	Q1BMultiTh(int n,String msg){
		this.n=n;
		this.msg=msg;
	}
	public void run(){
		try{
			for (int i=0;i<n ;i++ )
			{
				System.out.println(msg);
				Thread.sleep(550);
			}
			
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
	}
}

class  Q3
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		int n=10;
		String msg="Hello";
		String msg2="Good Morining";
		
			
		Q1AMultiTh pt1=new Q1AMultiTh(n,msg);
		Q1BMultiTh pt2=new Q1BMultiTh(n,msg2);
		
		//pt1.setPriority(Thread.MAX_PRIORITY);
		//pt2.setPriority(Thread.MIN_PRIORITY);
		
		pt1.start();
		pt2.start();

	}
}