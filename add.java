import java.awt.*;
import java.awt.event.*;

class add extends Frame implements ActionListener  {
	 Button b1,b2;
	 TextField tf1,tf2,tf3;
	 Label  l1,l2,l3;

	 add () {
	 	b1=new Button("add");
	 	b2=new Button("multiply");
	 	tf1=new TextField(10);
	 	tf2=new TextField(10);
	 	tf3=new TextField(10);
	 	l1=new Label("Enter first number");
	 	l2=new Label("Enter second number");
	 	l3=new Label("OUTPUT");
	 	setSize(800,800);
	 	setBounds(500,500,300,200);
	 	setVisible(true);
	 	setLayout(null);
	 	tf1.setBounds(300,100,200,100);
	 	tf2.setBounds(300,200,200,100);
	 	tf3.setBounds(300,300,200,100);
	 	l1.setBounds(100,100,200,100);	
	 	l2.setBounds(100,200,200,100);	
	 	l3.setBounds(100,300,200,100);	
	 	add(tf1);
	 	add(tf2);
	 	add(tf3);
	 	add(l1);
	 	add(l2);
	 	add(l3);
	 	b1.setBounds(530,300,70,100);
	 	b2.setBounds(600,300,70,100);
	 	add(b1);
	 	add(b2);
	 	b1.addActionListener(this);
	 	b2.addActionListener(this);

	 	addWindowListener(new WindowAdapter()
	 	{
	 		public void windowClosing(WindowEvent we){
	 			System.exit(0);
	 		}
	 	});

	 }
	 public void actionPerformed(ActionEvent e) {
	 		if (e.getSource()==b1) {
	 			int f=Integer.parseInt(tf1.getText());
	 			int g=Integer.parseInt(tf2.getText());
	 			int sum=f+g;
	 			tf3.setText(sum+"");
	 			
	 		}

	 		else if (e.getSource()==b2) {
	 			int f=Integer.parseInt(tf1.getText());
	 			 int g=Integer.parseInt(tf2.getText());
	 			int mul = f*g;
	 			tf3.setText(mul+"");

	 		}
	 }

	 public static void main(String[] args) {
	 	add n=new add();
	 }
}