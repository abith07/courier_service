package login;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/registerservlet")
public class registerservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
	private ServletRequest request;
    
    public registerservlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
        
        out.println("</head>");
        out.println("<body>");
        
        out.println("<img src='logo.png'>");
        
        out.println("<div class='wrapper'>");
        out.println("<form action='regcont' method='post'>");
        out.println("<h1>Register</h1>");
        out.println("<div class='input-form'>");
        out.println("<label for='UserName'>Enter the UserName:</label>");
        out.println("<input type='text' name='uname' id='UserName' placeholder='UserName' required>");
        out.println("</div>");
        out.println("<div class='input-form'>");
        out.println("<label for='Password'>Enter the Password:</label>");
        out.println("<input type='password' name='pwd' id='Password' placeholder='Password' required >");
        out.println("</div>");
        out.println("<div class='input-form'>");
        out.println("<button type='submit' value='submit'>Register</button>");
        out.println("</div>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
        
        
    
   
    
    
}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        doGet(request, response);
    }
}




