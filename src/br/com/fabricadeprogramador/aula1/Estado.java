package br.com.fabricadeprogramador.aula1;

public class Estado {
	private String uf;
	private String nome;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setUf(String uf){
		this.uf=uf.toUpperCase();
	}
	
	public String getUf(){
		return uf;
	}

	@Override
	public String toString() {
		return "Estado [uf=" + uf + ", nome=" + nome + "]";
	}
	
}
