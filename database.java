import java.sql.*;
public class database {
	
	public static void main(String...sam ) throws Exception {
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("okie");
	Connection n=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	System.out.println("okie2");
	
	}	

}
