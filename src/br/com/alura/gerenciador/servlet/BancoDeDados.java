package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoDeDados {

	private static List<Empresa> empresas = new ArrayList<>();
	
	public void adiciona(Empresa empresa) {
		BancoDeDados.empresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Collections.unmodifiableList(BancoDeDados.empresas);
	}
	
}
