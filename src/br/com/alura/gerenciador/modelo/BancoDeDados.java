package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BancoDeDados {

	private static List<Empresa> empresas = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa alura = new Empresa();
		alura.setNome("Alura");
		alura.setId(chaveSequencial++);
		
		Empresa caelum = new Empresa();
		caelum.setNome("Caelum");
		caelum.setId(chaveSequencial++);
		
		BancoDeDados.empresas.add(alura);
		BancoDeDados.empresas.add(caelum);
		
		Usuario alice = new Usuario();
		alice.setLogin("alice");
		alice.setSenha("12345");
		
		Usuario ana = new Usuario();
		ana.setLogin("ana");
		ana.setSenha("12345");
		
		BancoDeDados.usuarios.add(alice);
		BancoDeDados.usuarios.add(ana);
		
		
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);

		BancoDeDados.empresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Collections.unmodifiableList(BancoDeDados.empresas);
	}

	public void remove(Integer id) {
		Iterator<Empresa> iterador = empresas.iterator();
		
		while(iterador.hasNext()) {
			Empresa empresa = iterador.next();
			if(empresa.getId() == id) {
				iterador.remove();
			}
		}
	}

	public Empresa busca(Integer id) {
		for(Empresa empresa : empresas) {
			
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public void atualiza(String nomeEmpresa, Date dataAbertura, Integer id) {

		Empresa empresa = this.busca(id);
		if(empresa != null) {
			empresa.setDataAbertura(dataAbertura);
			empresa.setNome(nomeEmpresa);
		}

	}

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario : usuarios) {
			
			if(usuario.ehIgual(login, senha))
			{
				return usuario;
			}
		}		
		return null;
	}	
}
