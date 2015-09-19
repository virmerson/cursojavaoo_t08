package br.com.fabricadeprogramador.aula2;

import br.com.fabricadeprogramador.aula1.Cliente;

public class ProgramaPrincipal2 {

	public static void main(String[] args) {
		//Atribuicao polimorfica
		Pessoa empresa[] = new Pessoa[3];
		
		Funcionario f = new Funcionario();
		f.setCargo("Programador");
		f.setCpf("9090");
		f.setNome("JAO");
		
		empresa[0] =  f;
		/* empresa[0] = new Funcionario();
		empresa[0].setNome("JAO");
		( (Funcionario)empresa[0]).setCargo("PROGRAMADOR");
		*/
		empresa[1] = new Fornecedor();
		empresa[1].setNome("Zequinha");
		
		empresa[2] = new Cliente();
		empresa[2].setNome("Maria");
		
		for (int i=0; i< empresa.length; i++){
			System.out.print(empresa[i].getNome() );
			//Se o objeto for um funcionario
			if (empresa[i] instanceof Funcionario){
				//Casting de Pessoa para Funcionario para imprimir no cargo
				//System.out.print( " "  + ((Funcionario)  empresa[i]));
				
				Funcionario fTemp =  (Funcionario) empresa[i];
				System.out.print( " "+ fTemp.getCargo() + " " + fTemp.getCpf() );
			}
			//Quebra de linha
			System.out.println();
			
		}
		

	}

}
