// SECOND PROGRAM  FRAME + LABEL + BUTTON

import java.awt.*;

class MyFrame extends Frame
{
	MyFrame(){
		Frame f=new Frame("My Gui");
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		
		Label l=new Label("Hello :)");
		l.setBounds(20,10,100,100);
		
		Button b=new Button("Click kar bkl");
		b.setBounds(20,100,100,50);
	
		f.add(l);
		f.add(b);
		

	}
}

class  SecondP
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		MyFrame f=new MyFrame();
	}
}
