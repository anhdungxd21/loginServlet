import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ServiceConfigurationError;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServiceConfigurationError, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if("admin".equals(username) && "admin".equals(password)){
            writer.println("<h1>Welcome "+username+" to website</h1>");
        }else{
            writer.println("<h1>Login Error</h1>");
        }
        writer.println("</html>");
    }
}
