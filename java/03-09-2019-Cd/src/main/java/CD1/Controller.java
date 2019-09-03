package CD1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doProcess(request, response);
		} catch (ParseException e) {
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
			doProcess(request, response);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String CDtype=request.getParameter("CD-Type");
		
		if(CDtype.contains("SpecialCD")) {
			String title=request.getParameter("title");
			String artist=request.getParameter("artist");
			Date date = new SimpleDateFormat("dd-MM-yyyy").parse(request.getParameter("date")) ;
			double purchasecost=Integer.parseInt(request.getParameter("purchasecost"));
             HttpSession session=request.getSession();
            		session.setAttribute("cd",new CD(title,artist,date,purchasecost));
			RequestDispatcher view=request.getRequestDispatcher("Special.jsp");
			view.include(request, response);
		}
		else {
			String title=request.getParameter("title");
			String artist=request.getParameter("artist");
			Date date = new SimpleDateFormat("dd-MM-yyyy").parse(request.getParameter("date")) ;
			double purchasecost=Integer.parseInt(request.getParameter("purchasecost"));
             HttpSession session=request.getSession();
            		session.setAttribute("cd",new CD(title,artist,date,purchasecost));
			RequestDispatcher view=request.getRequestDispatcher("international.jsp");
			view.include(request, response);
		}
	}

}
