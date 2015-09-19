package br.com.fabricadeprogramador.aula3;

import br.com.fabricadeprogramador.aula2.Pessoa;


public class ProgramaPrincipalConstrutor {

	public static void main(String[] args) {
		Pessoa p0 = new Pessoa();
		
		Pessoa p1 = new Pessoa();
		
		Pessoa p3 = new Pessoa("Maria");
		System.out.println( p1.qtdInstancias  );
		//System.out.println( p2.qtdInstancias  );
		System.out.println( p3.qtdInstancias  );
	}

}
