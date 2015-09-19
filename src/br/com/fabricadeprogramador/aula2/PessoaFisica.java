package br.com.fabricadeprogramador.aula2;

import br.com.fabricadeprogramador.aula1.Cidade;

public class PessoaFisica  extends Pessoa{

	private String cpf;
	private String rg;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String nome, Cidade cidade, String cpf, String rg){
		setNome(nome);
		setCidade(cidade);
		setCpf(cpf);
		setRg(rg);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + "]";
	}
	
	
}
