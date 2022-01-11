import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Gridlayout{
	JButton add,sub,mul,div;
	JTextField num1,num2,result;
	JLabel l1,l2,result_lbl;
	JFrame frame;
	JPanel panel1;
	Gridlayout(){
		frame = new JFrame("Calculator");
		panel1 = new JPanel();

		l1 = new JLabel("Number 1: ");
		l2 = new JLabel("Number 2: ");
		result_lbl = new JLabel("Result: ");

		num1 = new JTextField();
		num2 = new JTextField();
		result = new JTextField();

		add = new JButton("Add");
		sub = new JButton("Sub");
		mul = new JButton("Mul");
		div = new JButton("Div");

		frame.add(l1);
		frame.add(num1);

		frame.add(l2);
		frame.add(num2);

		frame.add(result_lbl);
		frame.add(result);

		panel1.add(add);
		panel1.add(sub);
		panel1.add(mul);
		panel1.add(div);

		frame.add(panel1);
		frame.setSize(500,170);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(4,2));
		
		add.addActionListener(new Listener(this));
		sub.addActionListener(new Listener(this));
		mul.addActionListener(new Listener(this));
		div.addActionListener(new Listener(this));
	}
	public static void main(String[] args){
		new Gridlayout();
	}
}

class Listener implements ActionListener{
	Gridlayout ui;
	Listener(Gridlayout ui){
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