import java.awt.*;
import java.awt.event.*;
class Sum implements ActionListener {
	Frame f;
	TextField tf,tf1,tf2;
	Button b1;
	Sum(String s) {
		f=new Frame(s);
		tf=new TextField();
		tf1=new TextField();
		tf2=new TextField();
		b1=new Button("add");
		
		b1.addActionListener(this);
		f.addWindowListener(new WindowEventListener());
		
		f.add(tf);
		f.add(tf1);
		f.add(tf2);
		f.add(b1);
		
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s1=tf.getText();
		String s2=tf1.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=n1+n2;
		
		tf2.setText(String.valueOf(n3));
	
	}
	class WindowEventListener extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
};
	
	public static void main(String[] args) {
		Sum s=new Sum("sum");
	}
};