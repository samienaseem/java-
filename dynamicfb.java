import javax.swing.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dynamicfb extends JFrame {// implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField tf1;
	JPasswordField tf2; 
	static JButton b1;
	JLabel lb1,lb2;
	// static String s1,s2;
	 static WebDriver d;
	
	dynamicfb(String s) {
		super(s);
		setSize(900,600);
		setLayout(null);
		setVisible(true);
		
		tf1=new JTextField();
		tf1.setBounds(200,100,300,50);
		add(tf1);
		
		tf2=new JPasswordField();
		tf2.setBounds(200,150,300,50);
		add(tf2);
		
		lb1=new JLabel("Username");
		lb1.setBounds(100,100,100,50);
		add(lb1);
		
		lb2=new JLabel("Password");
		lb2.setBounds(100,150,100,50);
		add(lb2);
		
		b1=new JButton("Login");
		b1.setBounds(200,200,100,50);
		add(b1);
		
		b1.addActionListener((ActionListener) this);

		
	}
	
//	@SuppressWarnings("deprecation")
	/*public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			
			s1=tf1.getText();
			s2=tf2.getText();
			
			//new fbDatabase("fb");
			
			System.out.println(s2);
			try {
			System.setProperty("webdriver.chrome.driver","A:\\ANDROID DEVELOPMENT\\selenium-java-3.12.0\\chromedriver_win32\\chromedriver.exe");
			 d=new ChromeDriver();
			d.get("https://www.facebook.com");
			
			
			
			
			
			 d.findElement(By.id("email")).sendKeys(s1);
			 d.findElement(By.id("pass")).sendKeys(s2);
			 d.findElement(By.id("u_0_2")).click();
		//	 d.findElement(By.id("email")).
		
			}
			catch(Exception f) {
				System.out.println("Error");
				
			}
			
		//	tf1.setText("");
			//tf2.setText("");
		}
	}*/
	


	//@Override
//	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	//}
	
	

}
