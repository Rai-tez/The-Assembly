/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assembly.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            
            //get session and remove setAttributes from login servlet
            HttpSession session = request.getSession();
            session.removeAttribute("userID");
            session.removeAttribute("user");
            session.invalidate();
            response.sendRedirect("homepage.jsp");
        }
    
}
