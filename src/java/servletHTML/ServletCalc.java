package servletHTML;

/**
 *
 * @author Sánchez Rosas Andrés
 * 5IM9
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class ServletCalc extends HttpServlet {
    String ans;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        ans = peticion.getParameter("ans");
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Respuesta al Formulario del Servlet</title></head>");
        out.println("<body>");
        out.println("<p><h1><center>El resultado es: <B>" + "<script>ans = eval(ans.value);</script>" +ans+ "</B> </center></h1></p>");
        out.println("hoy es " + new Date());
        out.println("</body></html>");
        out.close();
    }
}
