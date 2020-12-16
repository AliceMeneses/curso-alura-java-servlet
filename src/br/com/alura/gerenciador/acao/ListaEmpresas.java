package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.BancoDeDados;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Listando empresas");
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		List<Empresa> empresas = bancoDeDados.getEmpresas();
		
		request.setAttribute("empresas", empresas);
		
		return "forward:listaEmpresas.jsp";
	}
}
