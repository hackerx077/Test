import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SampleWebpage")
public class SampleWebpage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Sample Webpage</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 20px; }");
        out.println(".secret { color: red; font-weight: bold; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome to My Sample Webpage</h1>");
        out.println("<p>This is a sample webpage to demonstrate hardcoding a secret.</p>");
        out.println("<p class=\"secret\">Secret: 12345</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
