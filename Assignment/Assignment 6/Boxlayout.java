import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Boxlayout{
	JButton add,sub,mul,div;
	JTextField num1,num2,result;
	JLabel l1,l2,result_lbl;
	JFrame frame;
	JPanel panel1,panel2,panel3,panel4;
	Boxlayout(){
		frame = new JFrame("Calculator");
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();

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

		panel1.add(l1);
		panel1.add(num1);

		panel2.add(l2);
		panel2.add(num2);

		panel3.add(result_lbl);
		panel3.add(result);

		panel4.add(add);
		panel4.add(sub);
		panel4.add(mul);
		panel4.add(div);

		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);

		frame.setSize(300,180);
		frame.setVisible(true);
		frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
		
		add.addActionListener(new Listener(this));
		sub.addActionListener(new Listener(this));
		mul.addActionListener(new Listener(this));
		div.addActionListener(new Listener(this));
	}
	public static void main(String[] args){
		new Boxlayout();
	}
}

class Listener implements ActionListener{
	Boxlayout ui;
	Listener(Boxlayout ui){
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