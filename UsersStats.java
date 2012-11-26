import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UsersStats extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
  throws IOException, ServletException {

    request.getSession();

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.print("Users:");
    out.print(ConcurrentUserTracker.getConcurrentUsers()+"</br>");
    out.print("Number of Images:");
    out.print(ImgCounter.RetreiveCnt()+"</br>");
    out.println("</html>");
  }
}