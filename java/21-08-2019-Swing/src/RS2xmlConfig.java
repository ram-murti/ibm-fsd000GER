import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.MyConnectionFactory;

public class RS2xmlConfig {
private MyConnectionFactory factory;
private Connection connection;
public RS2xmlConfig() throws SQLException {
	super();
	factory=MyConnectionFactory.createObject();
	connection=factory.getConnection();
}

public ResultSet getAllEmployee() throws SQLException {
	Statement st=connection.createStatement();
	System.out.println("abcs");
	ResultSet rs=st.executeQuery("select * from employee");
	System.out.println(rs.toString());
	return rs;
	
}

}
