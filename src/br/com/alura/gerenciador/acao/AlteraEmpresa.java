package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.BancoDeDados;

public class AlteraEmpresa {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Alterando empresa");

		String nomeEmpresa = request.getParameter("nome");
		String paramDataAbertura = request.getParameter("data");
		String id = request.getParameter("id");

		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.atualiza(nomeEmpresa, dataAbertura, Integer.valueOf(id));

		return "redirect:entrada?acao=ListaEmpresas";
	}
}
