// get two numbers and perform some operation +-* through buttons

import java.awt.*;
import java.awt.event.*;

class Operations extends Frame implements ActionListener
{
	TextField t1,t2;
	Button b1,b2,b3;
	Label l;
	
	Operations(){
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		
		t1=new TextField ("Enter a number");
		t2=new TextField ("Enetr a number");
		
		b1=new Button("Addition");
		b2=new Button("Substraction");
		b3=new Button("Multiplication");
		
		l=new Label();
		
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		
		if(e.getSource()==b1){
			l.setText(String.valueOf(num1+num2));
		}
		else if(e.getSource()==b2){
			l.setText(String.valueOf(num1-num2));
		}
		else if(e.getSource()==b3){
			l.setText(String.valueOf(num1*num2));
		}
	}
	
}


class ButtonOperation
{
	public static void main(String[] args) 
	{
		new Operations();
		//System.out.println("Hello World!");
	}
}
