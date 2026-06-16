import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PesquisarServlet")
public class PesquisarServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public PesquisarServlet() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        String nomeBusca = request.getParameter("txNomeBusca");
        ContatoDAO dao = new ContatoDAO();
        
        try {
            Contato c = dao.pesquisa(nomeBusca);
            PrintWriter out = response.getWriter();
            
            // Retorna o resultado estilizado unificado na paleta Sunset Premium
            out.append("<!DOCTYPE html><html lang='pt-br'><head><meta charset='UTF-8'>")
               .append("<meta name='viewport' content='width=device-width, initial-scale=1.0'>")
               .append("<title>Resultado da Busca | Contatos</title>")
               .append("<link href='https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@400;500;600;700&display=swap' rel='stylesheet'>")
               .append("<style>")
               .append("* { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Plus Jakarta Sans', sans-serif; -webkit-font-smoothing: antialiased; }")
               .append("body { background-color: #F9FAFB; background-image: radial-gradient(at 0% 0%, rgba(255, 140, 0, 0.07) 0px, transparent 50%), radial-gradient(at 100% 100%, rgba(230, 57, 70, 0.05) 0px, transparent 50%); display: flex; justify-content: center; align-items: center; min-height: 100vh; padding: 20px; }")
               .append(".container { width: 100%; max-width: 440px; perspective: 1000px; }")
               .append(".box { background: white; padding: 40px 32px; border-radius: 24px; box-shadow: 0 20px 40px -15px rgba(15, 23, 42, 0.06), 0 0 0 1px rgba(15, 23, 42, 0.04); text-align: center; width: 100%; transition: transform 0.3s; }")
               .append(".box:hover { transform: translateY(-4px); }")
               .append("h2 { color: #0F172A; margin-bottom: 24px; font-weight: 700; font-size: 24px; letter-spacing: -0.5px; }")
               .append(".info { background: #F1F5F9; padding: 16px; border-radius: 12px; margin-bottom: 12px; font-weight: 600; color: #1E293B; text-align: left; font-size: 15px; border-left: 4px solid #E63946; }")
               .append(".btn { display: block; width: 100%; margin-top: 24px; padding: 16px; background: linear-gradient(135deg, #FF8C00 0%, #E63946 100%); color: white; text-decoration: none; border-radius: 12px; font-weight: 600; font-size: 16px; box-shadow: 0 10px 20px -6px rgba(230, 57, 70, 0.3); transition: all 0.2s cubic-bezier(0.4, 0, 0.2, 1); }")
               .append(".btn:hover { box-shadow: 0 12px 24px -4px rgba(230, 57, 70, 0.4); transform: translateY(-1px); filter: brightness(1.05); }")
               .append(".btn:active { transform: translateY(1px); box-shadow: 0 6px 12px -4px rgba(230, 57, 70, 0.4); }")
               .append("p { color: #64748B; font-size: 14px; font-weight: 500; line-height: 1.5; }")
               .append("</style></head><body><div class='container'><div class='box'>");
            
            if (c != null) {
                out.append("<h2>Contato Localizado!</h2>")
                   .append("<div class='info'>👤 Nome: ").append(c.getNome()).append("</div>")
                   .append("<div class='info'>📞 Telefone: ").append(c.getTelefone()).append("</div>");
            } else {
                out.append("<h2>Não Encontrado</h2>")
                   .append("<p>Nenhum registro correspondente foi localizado na base de dados da agenda.</p>");
            }
            
            out.append("<a href='index.html' class='btn'>Voltar ao Painel</a>")
               .append("</div></div></body></html>");
               
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().append("Erro ao processar a pesquisa: " + e.getMessage());
        }
    }
}