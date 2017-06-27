package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import persistence.ProdutoDao;

@WebServlet("/Controle")
public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controle() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}
	
	protected void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			
			String cmd = request.getParameter("cmd");
			
			if(cmd.equalsIgnoreCase("gravar")){
				String nome = request.getParameter("nome");
				String preco = request.getParameter("preco");
				
				Produto prod = new Produto();
				prod.setNome(nome);
				prod.setPreco(new Double(preco));
				
				ProdutoDao pd = new ProdutoDao();
				pd.cadastrar(prod);
				
				request.setAttribute("msg", "Produto cadastrado com sucesso!");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
