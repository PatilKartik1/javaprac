// Q2. Design a servlet to display message as “Welcome IP address of client” to visitor

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the client's IP address
        String ipAddress = request.getRemoteAddr();

        // Set the response content type
        response.setContentType("text/html");

        // Write the welcome message to the response
        response.getWriter().println("<h1>Welcome " + ipAddress + "</h1>");
    }
}
