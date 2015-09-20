package br.com.fabricadeprogramador.aula3;

import br.com.fabricadeprogramador.aula2.Funcionario;
import br.com.fabricadeprogramador.aula2.Pessoa;
import br.com.fabricadeprogramador.aula2.PessoaFisica;
import br.com.fabricadeprogramador.aula2.PessoaJuridica;


public class ProgramaPrincipalConstrutor {

	public static void main(String[] args) {
		Pessoa p0 = new Pessoa();
		
		Pessoa p1 = new Pessoa();
		
		Pessoa p3 = new Pessoa("Maria");
		
		new PessoaFisica();
		
		new PessoaJuridica();
		
		new Funcionario();
		
		
		System.out.println(Pessoa.getQtdInstancias()  );
		//System.out.println( p2.qtdInstancias  );
		//System.out.println(Pessoa.getQtdInstancias()  );
	}

}
