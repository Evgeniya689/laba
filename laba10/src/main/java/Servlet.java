
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Получаем параметры запроса
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Создаем экземпляр класса, который будет обрабатывать параметры запроса
        Forma formProcessor = new Forma();

        // Обрабатываем параметры запроса и получаем результат
        String result = formProcessor.processForm(name, email);

        // Отправляем ответ клиенту
        if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
            // Если запрос является Ajax-запросом
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(result);
        } else {
            // Если запрос не является Ajax-запросом
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Form Submit Result:</h1>");
            out.print(result);
            out.println("</body></html>");
        }
    }
}