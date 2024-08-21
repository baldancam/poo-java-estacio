package lojaEletrodomesticos;

public class Principal {

	public static void main(String[] args) {

		Eletrodomestico geladeira = new Eletrodomestico();
		geladeira.tipo = "Geladeira";
		geladeira.marca = "Electrolux";
		geladeira.modelo = "Inverse Black Inox Look (IB7B)";
		geladeira.preco = 4559.05;
		geladeira.voltagem = 220;
		
		Eletrodomestico televisao = new Eletrodomestico();
		televisao.tipo = "TV";
		televisao.marca = "Samsung";
		televisao.modelo = "Smart TV 65\" UHD 4K 65DU7700";
		televisao.preco = 3318.68;
		televisao.voltagem = 220;
		
		
		Eletrodomestico lavaLoucas = new Eletrodomestico();
		lavaLoucas.tipo = "Lava Louças";
		lavaLoucas.marca = "Electrolux";
		lavaLoucas.modelo = "14 serviços Inox";
		lavaLoucas.preco = 4671.50;
		lavaLoucas.voltagem = 220;
		
				
		Cliente joao = new Cliente();
		joao.nome = "João Silva";
		joao.endereco = "Rua 13 de março, 27 - Guaporanga - São Paulo - SP - CEP: 65421-880";
		
		
		Cliente julia = new Cliente();
		julia.nome = "Julia da Costa";
		julia.endereco = "Rua Salvador Marinho, 2527 - Centro - Rio de Janeiro - RJ - CEP: 77221-210";
		
		geladeira.exibirInformacoes();
		televisao.exibirInformacoes();
		lavaLoucas.exibirInformacoes();
		
		joao.comprarEletrodomestico(geladeira);
		julia.comprarEletrodomestico(televisao);
		

	}

}
