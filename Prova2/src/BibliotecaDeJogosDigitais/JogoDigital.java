package BibliotecaDeJogosDigitais;

public class JogoDigital extends Jogo{

	public JogoDigital(String nome, String genero, float preco) {
		super(nome, genero, preco);
		
	}

	@Override
	public void exibirInformaçoes() {
		System.out.println("Nome do Jogo: "+ this.nome);
		System.out.println("Gênero do Jogo: "+ this.genero);
		System.out.println("Preço: R$" + this.preco);
		System.out.println(getNome() + " está exibindo sua informações...");
	}
	

}
