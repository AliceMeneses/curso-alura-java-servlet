package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoDeDados {

	private static List<Empresa> empresas = new ArrayList<>();
	
	static {
		Empresa alura = new Empresa();
		alura.setNome("Alura");
		Empresa caelum = new Empresa();
		caelum.setNome("Caelum");
		
		BancoDeDados.empresas.add(alura);
		BancoDeDados.empresas.add(caelum);
		
	}
	
	public void adiciona(Empresa empresa) {
		BancoDeDados.empresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Collections.unmodifiableList(BancoDeDados.empresas);
	}
	
}
