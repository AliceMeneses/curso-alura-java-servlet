package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.BancoDeDados;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Mostrando Empresa");
		
		String id = request.getParameter("id");

		BancoDeDados bancoDeDados = new BancoDeDados();
		Empresa empresa = bancoDeDados.busca(Integer.valueOf(id));

		request.setAttribute("empresa", empresa);
		
		return "forward:/formAlteraEmpresa.jsp";

	}
}
