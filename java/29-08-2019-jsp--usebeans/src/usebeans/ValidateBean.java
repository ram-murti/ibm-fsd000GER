package usebeans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import employee.MyConnectionFactory;


public class ValidateBean {
	 String user;
	  String pass;

	  public ValidateBean( ) {   }

	  public void setUser(String user)  				
	  {
	    this.user = user;
	  }
	  public String getUser( )
	  {
	    return user;
	  }

	  public void setPass(String pass)  				
	  {
	    this.pass = pass;
	  }
	  public String getPass( )
	  {
	    return pass;
	  }

	  public String validate(String s1,String s2) throws SQLException
	  {
			Connection connection = MyConnectionFactory.getMySqlConnectionForHr();
			Statement statement=connection.createStatement();
			
			ResultSet rs = statement.executeQuery("select * from employee1 where name='"+s1+"'"+" and password="+"'"+s2+"'");
			
			
              if(rs.next()) {
            	  return "valid";
              }
              else {
            	  return "invalid";
              }
	   
	   }
}
