import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
class logindatabase extends JFrame implements ActionListener {
       JButton b1,b2,b3;
       JTextField tf1,tf2;
       JLabel l1,l2;
       	Statement st;
       	{
       	try {

       	Class.forName("oracle.jdbc.driver.OracleDriver");
       	Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
       	st=cn.createStatement();
       	st.executeUpdate("create table schooldata(Username varchar2(20),Password varchar2(20))");
       }

       catch(Exception e) {
       	e.printStackTrace();
       }
     }
       
       logindatabase() {

       
       	setSize(700,700);
       	setVisible(true);
       	setLayout(null);

       	}

       	public void design(){
       		b1=new JButton("Register");
       		b1.setBounds(100,100,100,50);

       	add(b1);
       	b2=new JButton("Login");
		b2.setBounds(100,200,100,50);       	
       	add(b2);

       	b1.addActionListener(this);
       	b2.addActionListener(this);
       	}
       		

       public void actionPerformed(ActionEvent e) {
       	if (e.getSource()==b1) {
       		JFrame f=new JFrame();
       		f.setVisible(true);
       		f.setSize(600,600);
       		f.setLayout(null);
       		tf1=new JTextField();
       		tf2=new JTextField();
       		tf1.setBounds(150,50,200,50);
       		tf2.setBounds(150,100,200,50);
       		l1=new JLabel("Username");
       		l2=new JLabel("Password");
       		l1.setBounds(50,50,200,50);
       		l2.setBounds(50,100,200,50);
       		f.add(l1);
       		f.add(l2);
       		f.add(tf1);
       		f.add(tf2);
       		b3=new JButton("Register");
       		b3.setBounds(150,150,100,50);
       		f.add(b3);
       		b3.addActionListener(this);
       	}

       	if (e.getSource()==b2) {

       		login lg2=new login();
       		//lg2.connect();
       		
       	}

       	if (e.getSource()==b3) {

       		String a=tf1.getText();
       		String b=tf2.getText();

       		tf1.setText("");
       		tf2.setText("");

       		try{

       		st.executeUpdate("insert into schooldata values('"+a+"','"+b+"')");
       		System.out.println("data inserted");
       	}
       	catch(Exception f) {
       		f.printStackTrace();
       	}

	}
       }


       public static void main(String[] args)  {
       	logindatabase lg1= new logindatabase();
       	//lg1.connect();
       	lg1.design();
       }
}