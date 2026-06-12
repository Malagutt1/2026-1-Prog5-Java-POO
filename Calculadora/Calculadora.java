import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /* @see HttpServlet#HttpServlet() */
    public Calculadora() {
        super();
    }

	/* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String v1Str = request.getParameter("txtValor1");
        String v2Str = request.getParameter("txtValor2");
        String op = request.getParameter("txtOp");

        try {
                      
            if (v1Str == null || v2Str == null || op == null) {
                System.out.println("<h3>Por favor, acesse a <a href='index.html'>página inicial</a> para preencher o formulário.</h3>");
                return;
            }            
            double v1 = Double.parseDouble(v1Str);
            double v2 = Double.parseDouble(v2Str);
            double resultado = 0;

            if (op.equals("*") || op.equalsIgnoreCase("x")) {
                resultado = v1 * v2;
            }
            else if (op.equals("/")) {
            	if (v2 == 0) {
                    response.getWriter().println("Erro: divisão por zero.");
                    return;
                }
            	resultado = v1 / v2;
            	
            }
            else if (op.equals("+")) {
            	resultado = v1 + v2;            	
            }
            else if (op.equals("-")) {
            	resultado = v1 - v2;
            	
            }
         // Define o tipo de conteúdo e aceita acentuação
            response.setContentType("text/html;charset=UTF-8");
            java.io.PrintWriter out = response.getWriter();
            
            // Imprime o HTML melhorado linha por linha para ficar organizado
            out.println("<!DOCTYPE html>");
            out.println("<html lang='pt-BR'>");
            out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <title>Resultado | Calculadora</title>");
            out.println("    <style>");
            out.println("        * { box-sizing: border-box; margin: 0; padding: 0; }");
            out.println("        body { font-family: 'Segoe UI', Tahoma, sans-serif; background: linear-gradient(135deg, #f0f4f8 0%, #d9e2ec 100%); display: flex; justify-content: center; align-items: center; min-height: 100vh; color: #333; }");
            out.println("        .container { background: #fff; padding: 40px 30px; border-radius: 12px; box-shadow: 0 10px 30px rgba(0,0,0,0.1); width: 100%; max-width: 400px; text-align: center; }");
            out.println("        h2 { color: #1a365d; margin-bottom: 25px; }");
            // Estilo do Visor
            out.println("        .visor { background: #1a202c; color: #63b3ed; font-family: 'Consolas', monospace; font-size: 40px; font-weight: bold; text-align: right; padding: 15px 20px; border-radius: 8px; margin-bottom: 30px; box-shadow: inset 0 4px 10px rgba(0,0,0,0.6); border: 2px solid #cbd5e0; overflow: hidden; }");
            // Estilo do Botão Voltar
            out.println("        .btn-voltar { display: inline-block; width: 100%; padding: 14px; background: linear-gradient(135deg, #3182ce 0%, #2b6cb0 100%); color: white; text-decoration: none; border-radius: 6px; font-size: 16px; font-weight: bold; transition: all 0.3s ease; }");
            out.println("        .btn-voltar:hover { background: linear-gradient(135deg, #2b6cb0 0%, #2c5282 100%); transform: translateY(-2px); box-shadow: 0 4px 12px rgba(49, 130, 206, 0.3); }");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class='container'>");
            out.println("        <h2>Resultado do Cálculo</h2>");
            
            // Aqui injetamos a variável 'resultado' dentro da div do visor
            out.println("        <div class='visor'>" + resultado + "</div>");
            
            out.println("        <a href='index.html' class='btn-voltar'>Fazer Novo Cálculo</a>");
            out.println("    </div>");
            out.println("</body>");
            out.println("</html>");

        } catch (NumberFormatException e) {
            response.getWriter().println("Erro: valores inválidos.");
        }
    }

	/*@see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
