import javax.swing.*;
public class swing 
{
	JFrame f;
	JButton b,b1;
	swing()
	{
		f=new JFrame();
		b=new JButton("click");
		b1=new JButton("dont click");
		
		b.setBounds(130,100,100,40);
		b.setBounds(120,100,100,50);
		
		
		f.add(b);
		f.add(b1);
		f.setTitle("via association");
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new swing();
	}
}