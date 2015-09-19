package br.com.fabricadeprogramador.aula2;

import br.com.fabricadeprogramador.aula1.Cidade;

public class Pessoa {
	private String nome; //propriedade objeto
	
	private Cidade cidade;//propriedae objeto
	public static int qtdInstancias =0 ; //propriedade classe
	
	public Pessoa(){
		qtdInstancias++;
		System.out.println("Nova pessoa instanciada "+ qtdInstancias);
	}
	
	
	
	public Pessoa(String nome){
		setNome(nome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cidade=" + cidade + "]";
	}

	
}
