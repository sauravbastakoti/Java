import java.awt.*;  
import java.awt.event.*;

class ActionEventWithinClass extends Frame implements ActionListener
{
	Button a,s,m,d;
	TextField t1,t2,t3;
	public ActionEventWithinClass()
	{

		//Defining components

		Frame frame = new Frame();
		a=new Button("Add");
		s=new Button("Subract");
		m=new Button("Multiply");
		d=new Button("Divide");
		t1 = new TextField();   
        t2 = new TextField();   
        t3 = new TextField();
        Label l1 = new Label("Number 1 :");
        Label l2 = new Label("Number 2 :");
        Label l3 = new Label("Result :");

        //Setting Bounds

        t1.setBounds(150, 100, 250, 30);  
        t2.setBounds(150, 150, 250, 30);   
        t3.setBounds(150, 200, 250, 30);     
		a.setBounds(30,300,95,50); 
		s.setBounds(140,300,95,50); 
		m.setBounds(250,300,95,50); 
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
		frame.add(s);
		frame.add(m);
		frame.add(d);

		a.addActionListener(this);
		s.addActionListener(this);
		m.addActionListener(this);
		d.addActionListener(this);

		frame.setLayout(null);
		frame.setVisible(true);

	}
	public void actionPerformed(ActionEvent event) {
    
        double number1 = Double.parseDouble(t1.getText());
        double number2 = Double.parseDouble(t2.getText());
        try {
            if(event.getSource()==a)
            {
            t3.setText(String.valueOf(number1+number2));
            }
            if(event.getSource()==s)
            {
            t3.setText(String.valueOf(number1-number2));
            }
            if(event.getSource()==m)
            {
            t3.setText(String.valueOf(number1*number2));
            }
            if(event.getSource()==d)
            {
            t3.setText(String.valueOf(number1/number2));
            }
            
        }
        catch (Exception e) {
            t3.setText("Invalid"+" "+e.getMessage());
        }
        
    }

	public static void main(String[] args)
	{
		new ActionEventWithinClass();
	}


}