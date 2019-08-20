package jdbc_Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class JdbcDemo1 {
	private static Properties properties = null;
	static {
		properties = new Properties();
		properties.put("JDBC_URL", "jdbc:h2:~/my-db");
		properties.put("user", "sa");
		properties.put("password", "my-db");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Connection connection=DriverManager.getConnection(properties.getProperty("JDBC_URL"),
				properties.getProperty("user"),properties.getProperty("password"));
	Statement statement=connection.createStatement();
	ResultSet resultset =statement.executeQuery("select * from employee");
	System.out.println("ID NAME ");
	while(resultset.next()) {
		System.out.printf("\n%d %s",resultset.getInt(1),resultset.getString(2));
	}
	
	
	
	}

}
