import java.io.*;
class Q2 
{
	public static void main(String[] args) throws IOException
	{
		//System.out.println("Hello World!");
		FileReader fr=new FileReader("sample.txt");
		try{
			int ch;
			int cnt=0;
			int maxcnt=0;
			while((ch=fr.read()) != -1){
				if(ch != ' '){
					cnt +=1;
					if(cnt >maxcnt){
						maxcnt=cnt;
					}
				}
				else{
					cnt=0;
				}
			}
			
			System.out.println("longest word is of char: "+maxcnt);

			fr.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	
	}
}
