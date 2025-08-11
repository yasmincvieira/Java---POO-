package prova1;

public class Funcionario extends Pessoa{
	
	private float salario;

	public Funcionario(String nome, int idade, float salario) {
		super(nome, idade);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void trabalhar() {
		System.out.println(nome + " está trabalhando.");
	}

}
