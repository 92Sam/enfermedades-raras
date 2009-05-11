package er.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class for Servlet: FrontController
 *
 */
 public class FrontController extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public FrontController() {
		super();
	}   	
	
	String user = "practica";
	String passwd = "practica";
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}   	
	
	public void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		if (logado(request)) {
			String resource = request.getParameter("res");
			RequestDispatcher d = request.getRequestDispatcher(resource);
			if(d!=null){
				d.forward(request,response);
			}
			System.out.println("LOGADO ACCEDIENDO A " + resource);
		} else {
			response.sendRedirect("error.html");
		}

	}

	private boolean logado(HttpServletRequest request) {
		boolean logado = false;

		HttpSession session = request.getSession(false);

		String userForm = request.getParameter("user");
		String passwdForm = request.getParameter("pass");

		if (session == null) {
			session = request.getSession();
			if (userForm == null || passwdForm == null
					|| userForm.length() == 0 || passwdForm.length() == 0) {
				logado = false;

			} else {
				if (valido(userForm, passwdForm)) {
					logado = true;
					session.setAttribute("session.user", userForm);
				} else {
					logado = false;
				}

			}

		} else {
			if (userForm == null || passwdForm == null) {
				logado = true;
			} else {
				if (valido(userForm, passwdForm)) {
					logado = true;
					session.setAttribute("session.user", userForm);
				} else {
					logado = false;
				}

			}
		}
		return logado;
	}

	public boolean valido(String userForm, String passwdForm) {
		boolean res = false;
		res = (userForm.equals(this.user) && passwdForm.equals(this.passwd));
		return res;

	}
}