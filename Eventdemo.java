import java.awt.*;
import java.awt.event.*;
 class Eventdemo implements ActionListener {
	Frame f;
	TextField tf;
	Button b1,b2;
	Eventdemo(String s) {
		f=new Frame(s);
		tf=new TextField();
		b1=new Button("ok");
		b2=new Button("cancel");
		
		tf.setBounds(60,50,170,20);
		b1.setBounds(100,120,80,30);
		b2.setBounds(100,160,80,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f.add(tf);
		f.add(b1);
		f.add(b2);
		
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			tf.setText("ok");
		}
		if(e.getSource()==b2) {
			tf.setText("cancel");
		}
	}
	public static void main(String[] args) {
		Eventdemo f=new Eventdemo("event demo");
	}
};