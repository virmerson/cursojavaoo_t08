package br.com.fabricadeprogramador.aula2;

import java.awt.Font;

import br.com.fabricadeprogramador.aula1.Cidade;
import br.com.fabricadeprogramador.aula1.Cliente;
import br.com.fabricadeprogramador.aula1.Estado;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		Estado ms = new Estado();
		ms.setNome("Mato Grosso do Sul");
		ms.setUf("MS");
		
		System.out.println(ms);
		
		Cidade cg = new Cidade();
		cg.setNome("Campo Grande");
		cg.setEstado(ms);
		
		System.out.println(cg);

		Cliente cli = new Cliente();
		cli.setCidade(cg);
		cli.setNome("nono");
		cli.setCpf("9909090");
		cli.setRg("88989");
		
		//Funcionario		
		Funcionario func = new Funcionario();
		func.setCargo("Programador");
		func.setCidade(cg);
		func.setCpf("909090");
		func.setRg("99999");
		func.setNome("Zequinha");
		System.out.println(func);
		//Fornecedor
		Fornecedor fornec1 =  new Fornecedor();
		fornec1.setCidade(cg);
		fornec1.setCnpj("1079777919191/0001-34");
		fornec1.setNome("High Tech Cursos");
		fornec1.setRazaoSocial("High Tech Informática Ltda");
		
		
		System.out.println(fornec1);
		
		
		
	}

}
