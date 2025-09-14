import java.util.Scanner;
class mat
{
	int r;
	int c;
	int [][] arr;
	Scanner sc=new Scanner(System.in);
	mat(int r,int c){
	this.r= r;
	this.c= c;
	arr = new int[r][c];
	}
	
	void create(){
		System.out.println("Enter the data in the matrix");
		for (int i=0;i<r ;i++ )
		{
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	void print(){
		for (int i=0;i<r ;i++ )
		{
			for(int j=0;j<c;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void add(mat m1,mat m2){
		for(int i=0;i<r;i++){
			for (int j=0;j<c ;j++ )
			{
				arr[i][j]=m1.arr[i][j]+m2.arr[i][j];
			}
		}
	}
}


class Q1_Addition 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int r;
		int c;
		System.out.println("Enter the size of row and colunm");
		r=sc.nextInt();
		c=sc.nextInt();
		mat m1=new mat(r,c);
		m1.create();
		mat m2=new mat(r,c);
		m2.create();
		mat m3=new mat(r,c);
		m3.add(m1,m2);
		m3.print();
	}
}
