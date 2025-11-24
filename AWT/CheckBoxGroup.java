//There is no direct radio button in java so here what we do is create a CheckbixGroup and add the the checkbox mentioning the group name in 
//it will act like radio button


import java.awt.*;
import java.awt.event.*;

class Gender extends Frame implements ItemListener
{
	CheckboxGroup grp;
	Checkbox c1,c2,c3;
	Label l;
	
	Gender(){
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		
		grp=new CheckboxGroup();
		c1=new Checkbox("Male",grp,false);
		c2=new Checkbox("Female",grp,false);
		c3=new Checkbox("LGTV+-",grp,false);
		
		l=new Label();
		
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(l);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);

		f.setVisible(true);
		
	}
	
	public void itemStateChanged(ItemEvent e){
		if(c1.getState()==true)
			l.setText("Mard hai bhai tu!!");
		if(c2.getState()==true)
			l.setText("Accha toh Madamji Hai aap");
		if(c3.getState()==true)
			l.setText("Bhai/Bhen hai kon tu???");
	}
}


class  CheckBoxGroup
{
	public static void main(String[] args) 
	{
		new Gender();
		//System.out.println("Hello World!");
		
	}
}
