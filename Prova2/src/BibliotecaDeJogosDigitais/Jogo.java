package BibliotecaDeJogosDigitais;

public abstract class Jogo {
	
	String nome;
	String genero;
	float preco;
	
	public Jogo(String nome, String genero, float preco) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.preco = preco;
	}

	public abstract void exibirInformaçoes();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	

}
