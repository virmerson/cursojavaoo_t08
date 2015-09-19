package br.com.fabricadeprogramador.aula1;

public class Cidade {

	private Estado estado;
	private String nome;
	
	public void setEstado(Estado estado){
		this.estado=estado;
	}
	
	public Estado getEstado(){
		return estado;
	}
	
	public void setNome(String nome ){
		this.nome =  nome;
	}
	
	public String getNome(){
		return nome;
	}

	@Override
	public String toString() {
		return "Cidade [estado=" + estado + ", nome=" + nome + "]";
	}
	
}
