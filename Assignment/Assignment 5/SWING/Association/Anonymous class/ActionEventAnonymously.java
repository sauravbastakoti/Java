import javax.swing.*;  
import java.awt.event.*;

class ActionEventAnonymously {
   JButton a,s,m,d;
    JTextField t1,t2,t3;
    ActionEventAnonymously()
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

        m.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(t1.getText());
                double number2 = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(number1*number2));
                
                
            }
        });
        d.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(t1.getText());
                double number2 = Double.parseDouble(t2.getText());
                try {
                    if(e.getSource()==d)
                    {
                    t3.setText(String.valueOf(number1/number2));
                    }
                    
                } catch (Exception error) {
                    t3.setText("Invalid"+" "+error.getMessage());
                }
                
                
                
            }
        });
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(t1.getText());
                double number2 = Double.parseDouble(t2.getText());
            
                t3.setText(String.valueOf(number1+number2));
                
                
            }
        });
        s.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(t1.getText());
                double number2 = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(number1-number2));
                
                
            }
        });
        
    }
    
    public static void main(String[] args) {
        new ActionEventAnonymously();
    }
}