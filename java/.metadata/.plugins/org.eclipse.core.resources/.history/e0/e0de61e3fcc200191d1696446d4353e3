package jdbc_Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class JdbcDemo1 {
	private static Properties properties = null;
	static {
		properties = new Properties();
		properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/PERSON");
		properties.put("user", "root");
		properties.put("password", "root");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Connection connection=DriverManager.getConnection(properties.getProperty("JDBC_URL"),
				properties.getProperty("user"),properties.getProperty("password"));
	java.sql.Statement statement=connection.createStatement();
	ResultSet resultset =statement.executeQuery("select *from PERSON");
	System.out.println("ID NAME ");
	while(resultset.next()) {
		System.out.printf("\n%d %s %s",resultset.getInt(1),resultset.getString(2));
	}
	
	
	
	}

}
