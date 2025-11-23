//FIRST PROGRAM SHOW A WINDOW

import java.awt.*;

class myframe extends Frame
{
	myframe(){
		Frame f=new Frame("My Gui");
		//f.setLayout();
		f.setSize(400,300);
		f.setVisible(true);
	}
}

class window
{
	public static void main(String[] args) 
	{
		myframe f1=new myframe();
		//System.out.println("Hello World!");
	}
}
