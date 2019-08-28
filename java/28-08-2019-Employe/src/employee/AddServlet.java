package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAdd(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAdd(request, response);
	}
	protected void doAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		@SuppressWarnings("unchecked")
		List<String> err=(List<String>)request.getAttribute("ERROR");
		String s1=(String) request.getAttribute("SUCCESS");
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset='ISO-8859-1'>\r\n" + 
				"<title>EMPLOYEE</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n"  );
		if(err!=null) {
			for(String s:err)
			{
				out.println(s+"<br/>");
			}
		}
		else if(s1!=null) {
			out.println(s1);
		}
		
				out.println("	<form name='EMPLOYEE dETAILS' id='form-1' action='Controller_'>\r\n" + 
				"		<label for='input-1'>Name:</label>\r\n" + 
				"		<input id='input-1' placeholder='Name' name='Name' type='text'/><br>\r\n" + 
				"			<label for='input-2'>Password:</label>\r\n" + 
				"		<input id='input-2' placeholder='password' name='Password' type='password'/><br>\r\n" + 
				"			<label for='input-3'>Email:</label>\r\n" + 
				"		<input id='input-3' placeholder='email' name='Email' type='email'/><br>\r\n" + 
				"		<label for='input-4'>Country:</label>\r\n" + 
				"		<select>\r\n" + 
				"		<option value='Unknown'>Unknown</option>\r\n" + 
				"		<option value='India'>India</option>\r\n" + 
				"		<option value='Australia'>Australia</option>\r\n" + 
				"		</select><br>\r\n" + 
				"		<input type='submit' value='Submit' id='button-1'/>\r\n" + 
				"	</form>\r\n" + 
				"<a href='View_'>ViewAllEmployee</a>\r\n" +

				"</body>\r\n" + 
				"</html>");
	}

}
