import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Borderlayout{
	JButton add,sub,mul,div;
	JTextField num1,num2,result;
	JLabel l1,l2,result_lbl;
	JFrame frame;
	JPanel panel1,panel2,panel3,panel4;
	Borderlayout(){
		frame = new JFrame("Calculator");
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();

		l1 = new JLabel("Number 1: ");
		l2 = new JLabel("Number 2: ");
		result_lbl = new JLabel("Number 3: ");

		num1 = new JTextField();
		num2 = new JTextField();
		result = new JTextField();
		num1.setColumns(5);
		num2.setColumns(5);
		result.setColumns(5);

		add = new JButton("Add");
		sub = new JButton("Sub");
		mul = new JButton("Mul");
		div = new JButton("Div");

		// frame.setSize(500,500);
		panel1.setLayout(new BorderLayout());
		panel2.setLayout(new BorderLayout());
		panel3.setLayout(new BorderLayout());
		panel4.setLayout(new BorderLayout());

		panel1.add(l1,BorderLayout.WEST);
		panel1.add(num1,BorderLayout.CENTER);
		
		
		panel2.add(l2,BorderLayout.WEST);
		panel2.add(num2,BorderLayout.CENTER);

		panel3.add(result_lbl,BorderLayout.WEST);
		panel3.add(result,BorderLayout.CENTER);

		panel4.add(add,BorderLayout.NORTH);
		panel4.add(sub,BorderLayout.SOUTH);
		panel4.add(mul,BorderLayout.WEST);
		panel4.add(div,BorderLayout.EAST);

		frame.add(panel1,BorderLayout.WEST);
		frame.add(panel2,BorderLayout.CENTER);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.SOUTH);

		frame.pack();
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(50,50));
		
		add.addActionListener(new Listener(this));
		sub.addActionListener(new Listener(this));
		mul.addActionListener(new Listener(this));
		div.addActionListener(new Listener(this));
	}
	public static void main(String[] args){
		new Borderlayout();
	}
}

class Listener implements ActionListener{
	Borderlayout ui;
	Listener(Borderlayout ui){
		this.ui = ui;
	}
	public void actionPerformed(ActionEvent e){
		try{
			if(e.getSource() == ui.add){
				ui.result.setText(""+(Integer.parseInt(ui.num1.getText())+Integer.parseInt(ui.num2.getText())));
			}else if(e.getSource() == ui.sub){
				ui.result.setText(""+(Integer.parseInt(ui.num1.getText())-Integer.parseInt(ui.num2.getText())));
			}else if(e.getSource() == ui.mul){
				ui.result.setText(""+(Integer.parseInt(ui.num1.getText())*Integer.parseInt(ui.num2.getText())));
			}else if(e.getSource() == ui.div){
				try{
					ui.result.setText(""+(Integer.parseInt(ui.num1.getText())/(double)Integer.parseInt(ui.num2.getText())));
				}catch(ArithmeticException exc){
					ui.result.setText(exc.getMessage());
				}
			}
		}catch(NumberFormatException exc){
			ui.result.setText(exc.getMessage());
		}
	}
}