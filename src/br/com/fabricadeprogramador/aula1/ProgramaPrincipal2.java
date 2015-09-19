package br.com.fabricadeprogramador.aula1;

import java.util.Scanner;

public class ProgramaPrincipal2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Estado e = new Estado();
		
		System.out.println("UF:");
		
		e.setUf(leitor.next());
		System.out.println("Digitou: "+ e.getUf());
		
		
	}

}
