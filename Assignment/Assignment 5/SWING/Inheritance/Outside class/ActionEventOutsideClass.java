import javax.swing.*;  
import java.awt.event.*;

class ActionEventOutsideClass extends JFrame
{  JButton a,s,m,d;
    JTextField t1,t2,t3;
    ActionEventOutsideClass()
    {
       JFrame JFrame = new JFrame();
        a=new JButton("Add");
        s=new JButton("Subract");
        m=new JButton("Multiply");
        d=new JButton("Divide");
        t1 = new JTextField();   
        t2 = new JTextField();   
        t3 = new JTextField();
        JLabel l1 = new JLabel("Number 1 :");
        JLabel l2 = new JLabel("Number 2 :");
        JLabel l3 = new JLabel("Result :");

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


        //adding to JFrame

        JFrame.setSize(500, 400);
        JFrame.add(l1);
        JFrame.add(l2);
        JFrame.add(l3);
        JFrame.add(t1);
        JFrame.add(t2);
        JFrame.add(t3);
        JFrame.add(a);
        JFrame.add(s);
        JFrame.add(m);
        JFrame.add(d);
        JFrame.setLayout(null);
        JFrame.setVisible(true);
        a.addActionListener(new OutsideClass(this));
        s.addActionListener(new OutsideClass(this));
        m.addActionListener(new OutsideClass(this));
        d.addActionListener(new OutsideClass(this));
    }
    
    public static void main (String[] args) {
        new ActionEventOutsideClass();
    }
}
class OutsideClass  implements ActionListener
{
	ActionEventOutsideClass obj;
	public OutsideClass(ActionEventOutsideClass obj)
	{
        this.obj = obj;

    }
    @Override
    public void actionPerformed(ActionEvent event) {
    
        double number1 = Double.parseDouble(obj.t1.getText());
        double number2 = Double.parseDouble(obj.t2.getText());
        try {
            if(event.getSource()==obj.a)
            {
            obj.t3.setText(String.valueOf(number1+number2));
            }
            if(event.getSource()==obj.s)
            {
            obj.t3.setText(String.valueOf(number1-number2));
            }
            if(event.getSource()==obj.m)
            {
            obj.t3.setText(String.valueOf(number1*number2));
            }
            if(event.getSource()==obj.d)
            {
            obj.t3.setText(String.valueOf(number1/number2));
            }
            
        }
        catch (Exception e) {
            obj.t3.setText("Invalid"+" "+e.getMessage());
        }
        
    }
}