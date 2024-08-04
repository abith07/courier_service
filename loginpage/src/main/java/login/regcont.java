package login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regcont")
public class regcont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public regcont() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("uname");
 	    String password=request.getParameter("pwd");
 	    register m=new register(username,password);
 		registerdao n=new registerdao();
 		n.storedata(m);
 		RequestDispatcher rd = request.getRequestDispatcher("/registersuccess.jsp");
        rd.forward(request, response);
 		
 		
 		
	}

}
