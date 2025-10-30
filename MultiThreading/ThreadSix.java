class threadone implements Runnable
{
	public void run(){
		try{
			for (int i=0;i<10 ;i++ ){
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}

class  ThreadSix
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		threadone i1=new threadone();
		
		Thread t1=new Thread(i1,"Thread-1");
		Thread t2=new Thread(i1,"Thread-2");
		Thread t3=new Thread(i1,"Thread-3");

		System.out.println("Before t1 & t2 starts");
		
		/* t1.start();
		t2.start();
		t3.start();
		
		System.out.println("After t1 & t2 starts");
		
		try{
			System.out.println("Waiting for threads to finish...");
			t1.join();    //join dont let another therad to execute before it ends
			t2.join();
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		} */
		
		try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
		
		
		System.out.println("Are threads still alive?");
		System.out.println("t1: "+t1.isAlive());
		System.out.println("t2: "+t2.isAlive());
		
		System.out.println("The main thread executed");
	}
}
