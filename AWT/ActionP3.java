//Multiple Buttons With Actions

import java.awt.event.*;
import java.awt.*;

class colourbutton extends Frame implements ActionListener
{
	Button b1;
	Button b2;
	Button b3;
	Label l1,l2;
	colourbutton(){
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(500,500);
		
		b1=new Button("Red");
		b2=new Button("Green");
		b3=new Button("Blue");
		l1=new Label("Click a Button");
		l2=new Label();
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		f.setVisible(true);
		
	}
	
	public void  actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1){
			l2.setText("Red is Selected");
			l2.setBackground(Color.RED);
		}
		
		else if(e.getSource()== b2){
			l2.setText("Green Text is selected");
			l2.setBackground(Color.GREEN);
		}
		
		else if(e.getSource() == b3){
			l2.setText("Blue is Selected");
			l2.setBackground(Color.BLUE);
		}
	}
}

class  ActionP3
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		new colourbutton();
	
	}
}
