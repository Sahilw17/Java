//Simple scientific calculator with 5 buttons (), 2 text fields and label for result.

import java.awt.event.*;
import java.awt.*;

class Calculator extends Frame implements ActionListener 
{
	Button b1,b2,b3,b4,b5;
	TextField t1,t2;
	Label l;
	
	Calculator(){
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("x");
		b4=new Button("/");
		b5=new Button("%");
		
		t1=new TextField(10);
		t2=new TextField(10);
		
		l=new Label();
		
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(l);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);		
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		
		if(e.getSource()==b1){
			l.setText(String.valueOf(a+b));
		}
		
		if(e.getSource()==b2){
			l.setText(String.valueOf(a-b));
		}
		
		if(e.getSource()==b3){
			l.setText(String.valueOf(a*b));
		}
		
		if(e.getSource()==b4){
			l.setText(String.valueOf(a/b));
		}
		
		if(e.getSource()==b5){
			l.setText(String.valueOf(a%b));
		}
		
	}
}

class Mathcal
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		new Calculator();
	}
}
