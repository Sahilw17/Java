package pack1;
public class Utility
{
	int n;
	public Utility(int n) {
		this.n=n;
	}	
	public  void isPrime(){
		if(n<=2){
			System.out.println("Not Prime");
		}
		boolean flag=true;
		for (int i=2;i<n/2 ;i++ )
		{
			if(n%i==0){
				System.out.println("Not a prime number");
				return;
			}
			
			else{
				
				continue;
			}
		}
		System.out.println("Prime!!");
		return;
	}
}