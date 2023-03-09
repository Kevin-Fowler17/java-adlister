import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String crust = request.getParameter("crust");
        if (crust != null) {
            System.out.println("Crust: " + crust);
        }
        String sauce = request.getParameter("sauce");
        if (sauce != null) {
            System.out.println("Sauce: " + sauce);
        }
        String size = request.getParameter("size");
        if (size != null) {
            System.out.println("Size: " + size);
        }


        String beef = request.getParameter("Topping1");
        String ham = request.getParameter("Topping2");
        String philly_steak = request.getParameter("Topping3");
        String bacon = request.getParameter("Topping4");

        if (beef != null && ham != null && philly_steak != null && bacon != null) {
            System.out.println("Toppings ...");
        }
        if (beef != null) {
            System.out.println("Beef");
        }
        if (ham != null) {
            System.out.println("Ham");
        }
        if (philly_steak != null) {
            System.out.println("philly_steak");
        }
        if (bacon != null) {
            System.out.println("Bacon");
        }

        String address = request.getParameter("address");
        if (address != null && address != "") {
            System.out.println("Address:" + address);
        }



        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);

    }
}


