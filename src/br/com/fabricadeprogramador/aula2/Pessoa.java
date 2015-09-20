package br.com.fabricadeprogramador.aula2;

import br.com.fabricadeprogramador.aula1.Cidade;

public class Pessoa {
	private String nome; //propriedade objeto
	
	private Cidade cidade;//propriedae objeto
	private static int qtdInstancias =0 ; //propriedade classe
	//Construtor padrao
	public Pessoa(){
		this ("Jão",new Cidade());
		qtdInstancias++;
		System.out.println("Nova pessoa instanciada "+ qtdInstancias);
	}
	
	//Construtor sobrecarregado
	public Pessoa(String nome){
		this();// Chamando um construtor padrao
		setNome(nome);
		
	}
	
	public Pessoa(String nome, Cidade cidade){
		setNome(nome);
		setCidade(cidade);
	}
	//método estático
	public static int getQtdInstancias(){
		return qtdInstancias;
	}
	
	//Metodos Getter and Setters
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

	public String toString() {
		return "Pessoa [nome=" + nome + ", cidade=" + cidade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
}
