//Convert Full File to UPPERCASE (Using BufferedReader)

import java.io.*;
class  UpperCase
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		try{
			BufferedReader br=new BufferedReader(new FileReader("Source1.txt"));
			String line;
			
			while((line=br.readLine()) != null){
				System.out.println(line.toUpperCase());
			}
		}
		
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	
	}
}
