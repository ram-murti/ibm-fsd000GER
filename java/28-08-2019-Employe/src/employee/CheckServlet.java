package employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckServlet
 */
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doCheck(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doCheck(request, response);
	}
	protected void doCheck(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset='ISO-8859-1'>\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" ); 
				out.println( "Enter valid credential");
		out.println("form\r\n" + 
		
	
				"<form name='Login' id='form-1' action='ViewEmp_'>\r\n" + 
				"	<label for='input-1'>UserName:</label>\r\n" + 
				"	<input id='input-1' placeholder='UserName' Name='UserName'required='true' type='text'/><br>\r\n" + 
				"	<label for='input-2'>Password:</label>\r\n" + 
				"	<input id='input-2' placeholder='passwo' Name='password' required='true' type='password'/><br>\r\n" + 
				"	<input type='submit' value='Submit' id='button-1'/>\r\n" + 
				"</form>\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

}
