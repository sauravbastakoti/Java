import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Flowlayout{
	JButton add,sub,mul,div;
	JTextField num1,num2,result;
	JLabel l1,l2,result_lbl;
	JFrame frame;
	Flowlayout(){
		frame = new JFrame("Calculator");

		l1 = new JLabel("Number 1: ");
		l2 = new JLabel("Number 2: ");
		result_lbl = new JLabel("Result: ");

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

		frame.add(l1);
		frame.add(num1);

		frame.add(l2);
		frame.add(num2);

		frame.add(result_lbl);
		frame.add(result);

		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);

		// frame.add(panel1);
		frame.setSize(648,81);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		
		add.addActionListener(new Listener(this));
		sub.addActionListener(new Listener(this));
		mul.addActionListener(new Listener(this));
		div.addActionListener(new Listener(this));
	}
	public static void main(String[] args){
		new Flowlayout();
	}
}

class Listener implements ActionListener{
	Flowlayout ui;
	Listener(Flowlayout ui){
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