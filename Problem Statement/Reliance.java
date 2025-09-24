abstract class mart
{
	abstract void purchase();
	abstract void payment();
}

class onlinecst extends mart
{
	int discount;
	double price;
	onlinecst (double price){
		this.price=price;
	}
	void purchase(){
			if(price==2000)
				price=price-(price*0.05);
		
			else if(price>2000 && price <=3000)
				price=price-(price*0.07);
		
			else if(price>=4000)
				price=price-(price*0.09);
			System.out.println("Price to pay: "+price);
		}
		
	void payment(){
	} 	
}

class walkcst extends mart
{
		double price;
		walkcst(double price){
			this.price=price;
		}
		void purchase(){
			if(price==2000)
				price=price-(price*0.07);
		
			else if(price>2000 && price <=3000)
				price=price-(price*0.09);
		
			else if(price>=4000)
				price=price-(price*0.011);
			System.out.println("Price to pay: "+price);
		}
		
	void payment(){
	} 	
}


class Reliance
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		walkcst c1=new walkcst(2000.00);
		c1.purchase();
		
		onlinecst c2 =new onlinecst(2000);
		c2.purchase();
	}
}
