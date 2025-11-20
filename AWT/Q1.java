import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MyFrame extends Frame implements ActionListener
{
	TextField t1;
	Button b1;
	MyFrame(String st){
		super(st);
		
		setSize(400,400);
		setLayout(new FlowLayout());
		
		t1=new TextField("Enter the name of file");
		b1=new Button("View");
		
		add(t1);
		add(b1);
		
		b1.addActionListener(this);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		Button temp=(Button)e.getSource();
		String filename=t1.getText();
		try{
			BufferedReader br=new BufferedReader(new FileReader (filename));
			String line;
			while((line=br.readLine()) != null){
				System.out.println(line);
			}
		}
		
		catch(IOException e1){
			System.out.println(e1.getMessage());
		}
	}
	
	
}


class  Q1
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		MyFrame f=new MyFrame("My Gui");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				
		}
		});
	}
}


