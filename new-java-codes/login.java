import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.net.*;
class login extends logindatabase implements ActionListener {

	JTextField tf11,tf22;
	JButton b11,b12;
	JLabel lb1,lb2;
	static ResultSet rs;
	//Statement st;

	login() {

		tf11=new JTextField();
		tf11.setBounds(150,50,200,50);
		add(tf11);

		tf22=new JTextField();
		tf22.setBounds(150,100,200,50);
		add(tf22);

		lb1=new JLabel("usernamae");
		lb1.setBounds(50,50,200,50);
		add(lb1);

		lb2=new JLabel("Password");
		lb2.setBounds(50,100,200,50);
		add(lb2);

		b11=new JButton("Login");
		b11.setBounds(150,150,100,50);
		add(b11);

		b11.addActionListener(this);

		b12=new JButton("delete");
		b12.setBounds(150,300,100,50);
		add(b12);

		b12.addActionListener(this);
	}

	public void actionPerformed(ActionEvent p) {

		if(p.getSource()==b11) {

			String c=tf11.getText();
			String d=tf22.getText();

			tf11.setText("");
			tf22.setText("");

			try {


				//Desktop f=Desktop.getDesktop();
				//f.browse(new URI("www.amazon.in"));

					/*Class.forName("oracle.jdbc.driver.OracleDriver");
       	Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
       	st=cn.createStatement();*/
			rs=st.executeQuery("select * from schooldata where Username='"+c+"' and Password='"+d+"' ");
			System.out.println("done");

			boolean ss=rs.next();

			if (ss) {
				System.out.println("login success");
				Desktop f=Desktop.getDesktop();
				f.browse(new URI("www.amazon.in"));
			}
			else {
				System.out.println("try again");
			}


		}
		catch (Exception w) {
			System.out.println("not-done");	
		}


		}

		if (p.getSource()==b12) {

			try{

				Desktop d= Desktop.getDesktop();
				d.browse(new URI("https://www.google.com/"));
			}

			catch(Exception q) {

				q.printStackTrace();

			}
			
		}
	}

}