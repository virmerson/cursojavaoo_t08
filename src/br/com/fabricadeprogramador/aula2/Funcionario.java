package br.com.fabricadeprogramador.aula2;

public class Funcionario extends PessoaFisica {
	private String cargo;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + "]";
	}
	
	
	
}
