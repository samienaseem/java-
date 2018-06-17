import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbDatabase  extends dynamicfb implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Statement st;
	
	static String s1,s2; 
	
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("okie");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			System.out.println("okie2");
			st=cn.createStatement();
	       	st.executeUpdate("create table fbdata(Username varchar2(20),Password varchar2(20))");
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//System.out.println("samar");
	}
	
	fbDatabase(String s) {
		super(s);
		// TODO Auto-generated constructor stud
	}

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent c) {
		
		if(c.getSource()==b1) { 
			
			s1=tf1.getText();
			s2=tf2.getText();
			System.out.println(s1);
			
			try {
				st.executeUpdate("insert into fbdata values('"+s1+"','"+s2+"')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("error2");
			}
			
			//new fbDatabase("fb");
			
			//System.out.println(s2);
			try {
			System.setProperty("webdriver.chrome.driver","A:\\ANDROID DEVELOPMENT\\selenium-java-3.12.0\\chromedriver_win32\\chromedriver.exe");
			 d=new ChromeDriver();
			d.get("https://www.facebook.com");
			
			
			
			
			 d.findElement(By.id("email")).sendKeys(s1);
			 d.findElement(By.id("pass")).sendKeys(s2);
			 d.findElement(By.id("u_0_2")).click();
		
			}
			catch(Exception f) {
				System.out.println("Error");
				
			}
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new fbDatabase("dynamic login");
	}
	
	

}
