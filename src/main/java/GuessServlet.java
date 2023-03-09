import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Random rand = new Random();
        int randomNum = rand.nextInt((3 - 1) + 1) + 1;
        System.out.println("Number:" + randomNum);

        String numberGuessString = request.getParameter("numberGuess");
        int numberGuess=Integer.parseInt(numberGuessString);
        if ((numberGuess != 1 && numberGuess != 2 && numberGuess != 3)) {
            request.getRequestDispatcher("/guess.jsp").forward(request, response);
        } else if ((randomNum != numberGuess)) {
            request.getRequestDispatcher("/IncorrectServlet").forward(request, response);
        } else {
            request.getRequestDispatcher("/CorrectServlet").forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher("/guess.jsp").forward(request, response);

    }

}
