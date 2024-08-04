package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public FormServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        
        try {
            String fn = request.getParameter("fn");
            String ln = request.getParameter("ln");
            String un = request.getParameter("un");
            String em = request.getParameter("em");
            String add = request.getParameter("add");
            String add1 = request.getParameter("add1");
            String con = request.getParameter("con");
            String st = request.getParameter("st");
            String dt = request.getParameter("dt");
            String pn = request.getParameter("pn");
            String pinf = request.getParameter("pinf");
            String dtv = request.getParameter("dtv");
            String pm = request.getParameter("pm");
            
            // Optionally, validate and process the data as needed
            int pin = Integer.parseInt(pn);
            
            Form ff = new Form(fn, ln, un, em, add, add1, con, st, dt, pin, pinf, dtv, pm);
            formdao fm = new formdao(); 
            fm.storeData(ff);
            
            RequestDispatcher rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            
        } finally {
            out.close();
        }
    }
}
