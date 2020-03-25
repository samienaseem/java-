import java.sql.*;
class database {
	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("oki");

		Connection cn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		System.out.println("ok1");
		Statement st=cn.createStatement();
		st.executeUpdate("create table samar(eid number(10),name varchar2(20))");
		st.executeUpdate("insert into samar values(23,'shahnawaz') ");
		ResultSet rs1=st.executeQuery("select *from samar");

		while(rs1.next()){
			System.out.println(rs1.getInt("eid"));
			System.out.println(rs1.getString(1));

		}
		cn.close();


	}
}