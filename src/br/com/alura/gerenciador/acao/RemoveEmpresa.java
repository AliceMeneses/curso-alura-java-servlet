package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.BancoDeDados;

public class RemoveEmpresa implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Removendo Empresa");
		
		String id = request.getParameter("id");
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.remove(Integer.valueOf(id));
		
		return "redirect:entrada?acao=ListaEmpresas";
	}

}
