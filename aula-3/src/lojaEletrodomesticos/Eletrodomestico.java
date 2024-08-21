package lojaEletrodomesticos;

public class Eletrodomestico {
	
	String tipo;
	String marca;
	String modelo;
	double preco;
	int voltagem;

	public void exibirInformacoes() {

		System.out.println(tipo);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Voltagem: " + voltagem + "V\n\n");

	}

}
