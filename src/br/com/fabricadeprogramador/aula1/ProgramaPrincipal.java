package br.com.fabricadeprogramador.aula1;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Estado e = new Estado();
		e.setNome("Mato Grosso do Sul");
		e.setUf("ms");
		
		Cidade c1 = new Cidade();
		c1.setNome("Campo Grande");
		c1.setEstado(e);
		
		Cidade c2 = new Cidade();
		c2.setNome("Corgin");
		c2.setEstado(e);
		
		Cidade c3 = new Cidade();
		c3.setNome("Coxin");
		c3.setEstado(e);
		
		Cliente cli = new Cliente();
		cli.setNome("Jão");
		cli.setCidade(c3);
		
		System.out.println(c1.getNome());
		System.out.println(c1.getEstado().getNome());
		System.out.println(c1.getEstado().getUf());
		System.out.println("\n");
		System.out.println(cli.getNome());
		System.out.println(cli.getCidade().getNome());
		System.out.println(cli.getCidade().getEstado().getNome());
		System.out.println(cli.getCidade().getEstado().getUf());
	}

}
