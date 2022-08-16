import java.io.*;
import java.util.*;
import javax.servlet.http.*;

@WebServlet("/HelloServlet")
public class Main extends HttpServlet {
  public void doGet(HttpServletRequest req,
    HttpServletResponse res) throws IOException {
    Date d = new Date();
    PrintWrite w = res.getWriter();
    res.setContentTpe("text/html");
    w.write("<html><body>");
    w.write("today is " + d.toStrint());
    w.write("</body></html>");
  }
}