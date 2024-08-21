package lojaEletrodomesticos;

public class Cliente {
	
	String nome;
	String endereco;
	
	public void comprarEletrodomestico(Eletrodomestico e) {
		System.out.println("Nome: " + nome + "\nEndereço: " + endereco + "\nComprou um/uma: " + e.tipo + "\nMarca:" + e.marca 
				+ "\nModelo: " + e.modelo + "\nPreço: " + e.preco + "\n\n");
	}
	

}
