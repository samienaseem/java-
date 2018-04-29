import javax.swing.*;
class swing1  
{
	JFrame f;
	JButton b;
	swing1() {
		f=new JFrame();
		b=new JButton("click");

		b.setBounds(130,100,100,40);
		f.add(b);
		f.setTitle("swing via association");
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new swing1();
	}
}
