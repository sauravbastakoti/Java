import java.awt.*;    
import javax.swing.*;   
import java.awt.event.*;
public class CardLayout extends JFrame implements ActionListener  
{      
	CardLayout cards;    
	JButton first, second, third ,fourth;    
	Container cPane;   
    CardLayout()  {    
  
      cPane = getContentPane();    
      cards = new CardLayout();      
      cPane.setLayout(null);   
  
first = new JButton("This is First");    
second = new JButton("This is Second");    
third = new JButton("This is Third");   
fourth = new JButton("This is Last"); 
 
first.addActionListener(this);    
second.addActionListener(this);    
third.addActionListener(this);    
fourth.addActionListener(this);   
  
cPane.add("a", first);   
cPane.add("b", second);  
cPane.add("c", third);  
cPane.add("d", fourth);          
}    
public void actionPerformed(ActionEvent e)   
{    
cards.next(cPane);      
}    
  
public static void main(String args[])   
{     
CardLayout c= new CardLayout();   
   
c.setSize(300, 300);    
c.setVisible(true);    
c.setDefaultCloseOperation(EXIT_ON_CLOSE);    
}    
}    