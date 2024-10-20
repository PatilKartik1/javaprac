// Q2. Write a servlet program to display current date and time of server. [20 Marks]


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class DateTimeServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type of the response
        response.setContentType("text/html");
        
        // Get the writer to write the output to the client
        PrintWriter out = response.getWriter();
        
        // Get the current date and time
        Date currentDate = new Date();
        
        // Display the current date and time on the webpage
        out.println("<html><body>");
        out.println("<h2>Current Date and Time: " + currentDate.toString() + "</h2>");
        out.println("</body></html>");
        
        // Close the writer
        out.close();
    }
}
