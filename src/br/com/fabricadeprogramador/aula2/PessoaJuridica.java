package br.com.fabricadeprogramador.aula2;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String razaoSocial;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial
				+ "]";
	}
	
}
