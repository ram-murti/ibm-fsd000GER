package employee;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConnectionFactory {
private static DataSource datasource=null;
private static Connection connection=null;
public static Connection getMySqlConnectionForHr() {
	
	try {
		Context initContext = new InitialContext();
		Object o=initContext.lookup("java:/comp/env/jdbc/mysql");
		datasource=(DataSource)o;
		connection=datasource.getConnection();
	} catch (NamingException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
}
}
