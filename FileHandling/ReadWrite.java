import java.io.*;
class ReadWrite 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		try{
			FileWriter fw =new FileWriter("sample.txt");
			fw.write("Hello My name is Raze");
			fw.write("My abilities are to bom,use sachlates and booom");
			fw.close();
			
			FileReader fr= new FileReader("sample.txt");
			int i;
			while((i=fr.read()) != -1){
				System.out.print((char)i);
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		finally{
				
				fr.close();

		}
		
	}
}
