package viagem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import viagem.model.viagem;


/**
 * Servlet implementation class viagemController
 */
@WebServlet("/viagemController")
public class viagemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       

    public viagemController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String dataIda = request.getParameter("dataIda");
		String dataVolta = request.getParameter("dataVolta");
		String origem = request.getParameter("origem");
		String destino = request.getParameter("destino");
		String formaPagamento = request.getParameter("pagamento");
		String mensagem;
		float valorPago = 0;
		
		viagem viagem = new viagem(dataIda, dataVolta, origem, destino, formaPagamento, valorPago);

		
		viagem.setDataIda(dataIda);
		viagem.setDataVolta(dataVolta);
		viagem.setOrigem(origem);
		viagem.setDestino(destino);
		viagem.setFormaPagamento(formaPagamento);
		viagem.salvar();
		
		mensagem = "Compra de viagem realizada com sucesso!";
		request.setAttribute("mensagem", mensagem);
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastroViagem.jsp");
		dispatcher.forward(request, response);
	}

}

/*		switch(destino) {
			case  'Cabo Frio':
				valorPago = 379.00;
				break;
			case 'Paris':
				valorPago = 2.199.00;
				break;
			case 'Natal':
				valorPago = 999.00;
				break;
			case 'Buenos Aires':
				valorPago = 799.00;
				break;
			case 'Caraiva':
				valorPago = 599.00;
				break;
			case 'Balneario Camboriu':
				valorPago = 499.00;
				break;
			default:
				valorPago = 0;
		}
		*/

