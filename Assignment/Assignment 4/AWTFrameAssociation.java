import java.awt.Button;
import java.awt.Container;
import java.awt.Frame;
import java.awt.*;  

class AWTFrameAssociation
{
	public static void main(String[] args) {

		//Defining components

		Frame frame = new Frame();
		Button a=new Button("Add");
		Button b=new Button("Subract");
		Button c=new Button("Multiply");
		Button d=new Button("Divide");
		TextField t1 = new TextField();   
        TextField t2 = new TextField();   
        TextField t3 = new TextField();
        Label l1 = new Label("Number 1 :");
        Label l2 = new Label("Number 2 :");
        Label l3 = new Label("Result :");

        //Setting Bounds

        t1.setBounds(150, 100, 250, 30);  
        t2.setBounds(150, 150, 250, 30);   
        t3.setBounds(150, 200, 250, 30);     
		a.setBounds(30,300,95,50); 
		b.setBounds(140,300,95,50); 
		c.setBounds(250,300,95,50); 
		d.setBounds(360,300,95,50); 
		l1.setBounds(30, 100, 100, 30);    
        l2.setBounds(30, 150, 100, 30);  
        l3.setBounds(30, 200, 100, 30);  


        //adding to frame

		frame.setSize(500, 400);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(a);
		frame.add(b);
		frame.add(c);
		frame.add(d);

		frame.setLayout(null);
		frame.setVisible(true);

	}
}