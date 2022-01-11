import java.awt.*;  
import java.awt.event.*;

class CalculatorAnonymously extends Frame{
    Button a,s,m,d;
    TextField t1,t2,t3;
    CalculatorAnonymously()
    {
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
        frame.setLayout(null);
        frame.setVisible(true);
        
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
        new CalculatorAnonymously();
    }
}