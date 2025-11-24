//List

import java.awt.*;
import java .awt.event.*;

class CitySushi extends Frame implements ItemListener
{
	Choice c;
	Label l;
	
	CitySushi(){
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		
		c=new Choice();
		c.add("Pune");
		c.add("Mumbai");
		c.add("Delhi");
		c.add("Bang-Lore");
		l=new Label("The City with Most BodyCount");
		
		f.add(c);
		f.add(l);
		
		c.addItemListener(this);
		f.setVisible(true);
		
	}
	
	public void itemStateChanged(ItemEvent e){
		l.setText("The City you are from :"+c.getSelectedItem());
	}
}

class  ListBox
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		new CitySushi();
	}
}
