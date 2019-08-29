package employee1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controller1
 */
public class controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String name,pass,email,country;
    private List<String> errMsgs;
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doControl(request, response);
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
			doControl(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doControl(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		errMsgs=new ArrayList<String>();
		name=request.getParameter("Name");
		country=request.getParameter("Country");
		email=request.getParameter("Email");
		pass=request.getParameter("Password");
		if(name.length()<2) {
			errMsgs.add("length should be greater than 2");
		}
		if(country.equals("Unknown")) {
			errMsgs.add("Country is unknown");

		}
		if(errMsgs.isEmpty())
		{
			
			
			request.setAttribute("SUCCESS", "Added SuccessFully");
			RequestDispatcher view=request.getRequestDispatcher("template.jsp");
			view.forward(request, response);

	}
		
			else {
				request.setAttribute("ERROR", "error");
				RequestDispatcher view=request.getRequestDispatcher("template.jsp");
				view.forward(request, response);
			}
		
		

	}
}
