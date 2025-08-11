package prova1;

public class Principal {

	public static void main(String[] args) {
		
	 Pessoa pessoa1 = new Pessoa("Yasmin", 17);
	 Pessoa pessoa2 = new Pessoa("Gutavo", 18);
	 
	 pessoa1.setNome("Yasmin");
	 pessoa1.setIdade(17);
	 
	 pessoa2.setNome("Gutavo");
	 pessoa2.setIdade(18);
	 
	 System.out.println("---Pesoa 1---");
	 System.out.println("Nome: " + pessoa1.getNome());
	 System.out.println("Idade: " + pessoa1.getIdade());
	 
	 pessoa1.andar(2);
	 pessoa1.falar("Prova");
	 
	 System.out.println("---Pessoa 2---");
	 System.out.println("Nome: " + pessoa2.getNome());
	 System.out.println("Idade: " + pessoa2.getIdade());
	 
	 pessoa2.andar(4);
	 pessoa2.falar("Aula");
	 
	 Funcionario funcionario = new Funcionario("Yasmin", 17, 4000);
	 
	 System.out.println("---Funcionário---");
	 System.out.println("Nome: " + funcionario.getNome());
	 System.out.println("Idade: " + funcionario.getIdade());
	 System.out.println("Salário: " + funcionario.getSalario());
	 
	 funcionario.trabalhar();

	}
}
