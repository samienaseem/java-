import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class gridlayout
{
	JFrame f;
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	gridlayout(String s) {
		f=new JFrame(s);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		tf=new JTextField();
		tf.setBounds(150,40,100,100);
			
			f.add(tf);
		    f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			f.add(b5);
			f.add(b6);
			f.add(b7);
			f.add(b8);
			f.add(b9);

			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);

		f.setLayout(new GridLayout(3,3,10,10));

		f.setSize(500,300);
		f.setVisible(true);


		
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==b1)
		{
			tf.setText("1");
		}
		if (e.getSource()==b2)
		{
			tf.setText("2");
		}
		if (e.getSource()==b3)
		{
			tf.setText("3");
		}
		if (e.getSource()==b4)
		{
			tf.setText("4");
		}
		if (e.getSource()==b5)
		{
			tf.setText("5");
		}
		if (e.getSource()==b6)
		{
			tf.setText("6");
		}
		if (e.getSource()==b7)
		{
			tf.setText("7");
		}
		if (e.getSource()==b8)
		{
			tf.setText("8");
		}
		if (e.getSource()==b9)
		{
			tf.setText("9");
		}
	}
	public static void main(String[] args) {
		new gridlayout("grid layout example");
	}
}