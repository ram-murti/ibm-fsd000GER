

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
		doAddValidateSamePage(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAddValidateSamePage(request, response);
	}
	protected void doAddValidateSamePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		@SuppressWarnings("unchecked")
		List<String> err=(List<String>)request.getAttribute("ERROR");
		
		
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset='ISO-8859-1'>\r\n" + 
				"<title>Add League Details</title>\r\n" + 
				"</head>\r\n" + 
				"<body><div style='color:red'>" ); 
		if(err!=null) {
			for(String s:err)
			{
				out.println(s+"<br/>");
			}
		}
		out.println("</div>	<form name='Title' id='form-1' action='Add_league.do' method='post'>\r\n" + 
				"		<input id='input-1' placeholder='Sea..' type='text' name='season' required='required'/><br>\r\n" + 
				"		<input id='input-1' placeholder='Tit..' type='text' name='title' required='required'/><br>\r\n" + 
				"		<input id='input-1' placeholder='Ye..' type='text' name='Year'/><br>\r\n" + 
				"		<input type='submit' value='Submit' id='button-1'/>\r\n" + 
				"	</form>\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}
}

