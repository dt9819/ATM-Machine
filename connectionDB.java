import java.sql.*;
public class connectionDB{
	public static Connection conn;
	public static Connection mycon()
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ATM_Machine","root","root");
		}
		catch(Exception e){
			System.out.println(e);
		}
		return conn;
	}
}
