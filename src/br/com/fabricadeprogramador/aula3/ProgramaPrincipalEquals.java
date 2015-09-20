package br.com.fabricadeprogramador.aula3;

import br.com.fabricadeprogramador.aula2.Pessoa;

public class ProgramaPrincipalEquals {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Jão");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Jao");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p2.equals(p1));
		
	}
}
