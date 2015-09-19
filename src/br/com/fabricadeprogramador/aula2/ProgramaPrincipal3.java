package br.com.fabricadeprogramador.aula2;

public class ProgramaPrincipal3 {

	public static void main(String[] args) {
		
		Pessoa p = new Funcionario();
		
		p.setNome("JÃO");
		
		//Casting
		( (Funcionario)p ).setCargo("Programador");
		

	}

}
