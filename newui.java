import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class newui extends JFrame  implements ActionListener {

	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JTextField tf1,tf2,tf3,tf4;
	String ss[]=new String[256];
	String s;
		int i=0;

	newui( String s) {
		super(s);
		setSize(600,600);
		setVisible(true);
		setLayout(new GridLayout(3,3,10,10));
	}

	 public void uibuttons() {
		

		b1=new JButton("add");
		b2=new JButton("update");
		b3=new JButton("search");
		b4=new JButton("delete");
		b5=new JButton("exit");
		b8=new JButton("Display");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b8);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b8.addActionListener(this);

	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			newui sa=new newui("add button frame");
			 tf1=new JTextField();
			sa.add(tf1);
			//tf1.setBounds(60,60,100,100);
			 b6=new JButton("sumbit");
			sa.add(b6);
			b6.addActionListener(this);


		}
		else if(e.getSource()==b2) {
			new newui("update Frame");
		}
		else if(e.getSource()==b3) {
			newui sc=new newui("search frame");
			tf3=new JTextField();
			sc.add(tf3);
			b7=new JButton("search");
			sc.add(b7);
			b7.addActionListener(this);


		}
		else if(e.getSource()==b4) {
			new newui("delete frame");
		}
		else if (e.getSource()==b5) {
			System.exit(0);
		}

		else if (e.getSource()==b6) {
			ss[i]=tf1.getText();
			tf1.setText("");
			i++;
		
		
			//sb.add(tf2);

			//tf2.setText(ss[0]);

			//System.out.println(ss[0]);
			//System.out.println(ss[]);
		}
		else if (e.getSource()==b7) {
			s=tf3.getText();
			for (i=0;i<256 ;i++ ) {
				if(ss[i].equals(s)){
				System.out.println("found"); 
				break;
			}
		    
			}
		}

		else if (e.getSource()==b8){
			newui sd=new newui("Display Frame");
			tf4=new JTextField();
			sd.add(tf4);
			for(i=0;i<5;i++){
			tf4.setText(tf4.getText()+ss[i]);
			System.out.println(ss[i]);
		}
		}
	

	}





	public static void main(String[] args) throws Exception {
		newui n=new newui("new java UI");
		n.uibuttons();
	}

}