//Count Total Lines in a File

import java.io.*;

class  CountLines
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		try{
			BufferedReader br=new BufferedReader(new FileReader ("Source1.txt"));
			String line;
			int cnt=0;
			
			while((line=br.readLine())!=null){
				cnt++;
			}
			System.out.println("The total number of line from PARO song are : "+cnt);
			br.close();
		}
		
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	
	}
}
