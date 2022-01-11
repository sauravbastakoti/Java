import javax.swing.*;

class SWINGFrameAssociation
{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton a=new JButton("Add");
		JButton b=new JButton("Subract");
		JButton c=new JButton("Multiply");
		JButton d=new JButton("Divide");
		JTextField t1 = new JTextField();   
        JTextField t2 = new JTextField();   
        JTextField t3 = new JTextField();
        JLabel l1 = new JLabel("Number 1 :");
        JLabel l2 = new JLabel("Number 2 :");
        JLabel l3 = new JLabel("Result :");

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