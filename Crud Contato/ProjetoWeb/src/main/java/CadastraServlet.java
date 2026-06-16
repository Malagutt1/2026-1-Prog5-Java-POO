import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CadastraServlet")
public class CadastraServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public CadastraServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        String nome = request.getParameter("txNome");
        String telefone = request.getParameter("txTel");
        
        Contato c = new Contato(nome, telefone);
        ContatoDAO dao = new ContatoDAO();
        
        try {
            dao.cadastra(c);
            response.sendRedirect("index.html");
            
        } catch (Exception e) {
            e.printStackTrace();
            // Caso dê erro no banco, avisa na tela
            response.getWriter().append("Erro ao cadastrar no banco de dados: " + e.getMessage());
        }
    }
}