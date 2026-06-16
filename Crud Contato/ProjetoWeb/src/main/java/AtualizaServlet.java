import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AtualizaServlet")
public class AtualizaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public AtualizaServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        // 1. Captura a identificação e os novos valores
        String nomeAntigo = request.getParameter("txNomeAntigo");
        String nomeNovo = request.getParameter("txNomeNovo");
        String telNovo = request.getParameter("txTelNovo");
        
        // 2. Cria o objeto Contato com as novas informações
        Contato novoContato = new Contato(nomeNovo, telNovo);
        ContatoDAO dao = new ContatoDAO();
        
        try {
            // 3. Executa a query de Update passando o parâmetro de busca e os dados novos
            dao.atualiza(nomeAntigo, novoContato);
            
            // 4. Redireciona de volta para a central
            response.sendRedirect("index.html");
            
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().append("Erro ao atualizar o registro: " + e.getMessage());
        }
    }
}