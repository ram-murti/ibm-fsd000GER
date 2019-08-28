package employee;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerView
 */
public class ControllerView extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private String name,pass,email,country;
     private List<String> errMsgs;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doControl(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doControl(request, response);
	}
	protected void doControl(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		errMsgs=new LinkedList<String>();
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
			RequestDispatcher view=request.getRequestDispatcher("Update");
			view.forward(request, response);

	}

}
}