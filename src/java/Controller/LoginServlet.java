package Controller;

import Model.Login;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Login lg1 = new Login();
        lg1.setUsername(username);
        lg1.setPassword(password);

        if (username.equals("madda") && password.equals("madda123")) {
            HttpSession session = request.getSession();
            session.setAttribute("log", lg1);
            RequestDispatcher dispatcher = request.getRequestDispatcher("LoginSuccess.jsp");

            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("LoginForm.jsp");
            out.println("<font color=red>Either Username or Password is incorrect</font>");
            dispatcher.include(request, response);
        }

    }

}
