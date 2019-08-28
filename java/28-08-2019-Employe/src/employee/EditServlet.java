package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Statement statement = null;
    private ResultSet resultSet=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doEdit(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doEdit(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Employee m=new Employee();
		String name = request.getParameter("name");
		List<Employee> emp = new ArrayList<Employee>();
		@SuppressWarnings("unchecked")
		List<String> err=(List<String>)request.getAttribute("ERROR");
		String s1=(String) request.getAttribute("SUCCESS");
		Connection connection = MyConnectionFactory.getMySqlConnectionForHr();
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from employee1 where name = " +"'"+ name+"'");
		while (resultSet.next()) {
			m = new Employee(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4));
			
		}
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>EMPLOYEE</title>\r\n" + 
				"</head>\r\n" + 
				"<body>");
		if(err!=null) {
			for(String s:err)
			{
				out.println(s+"<br/>");
			}
		}
		else if(s1!=null) {
			out.println(s1);
		}
		
				out.println("	<form name=\"EMPLOYEE dETAILS\" id=\"form-1\" action=\"Update?name="+name+"\" id=\\\"form-1\\\" method=\"post\">\r\n" + 
				
				"			<label for='input-2'>Password:</label>\r\n" + 
				"		<input id='input-2' placeholder='password' value='"+m.getPassword() +"' name='Password' type='password'/><br>\r\n" + 
				"			<label for='input-3'>Email:</label>\r\n" + 
				"		<input id='input-3' placeholder='email' value='"+m.getEmail() +"'name='Email' type='email'/><br>\r\n" + 
				"		<label for='input-4'>Country:</label>\r\n" + 
				"		<select name='Country'>\r\n" + 
				"		<option value='Unknown'>Unknown</option>\r\n" + 
				"		<option value='India'>India</option>\r\n" + 
				"		<option value='Australia'>Australia</option>\r\n" + 
				"		</select><br></body>\r\n" + 
				"  		<input type=\"submit\" value=\"Submit\" id=\"button-1\"/>\r\n" + 
				"        <a href=\"check.html\">ViewAllEmployee</a>\r\n" +
				"</html>");
	}

}
