package sistemaBancario;

public class Endereco {

	String rua;
	int numero;
	String cep;
	String cidade;
	String estado;

	@Override
	public String toString() {

		String endereco = """
				Rua: %s
				Número: %d
				CEP: %s
				Cidade: %s
				Estado: %s
				""";
		String enderecoFormatado = String.format(endereco, rua, numero, cep, cidade, estado);
		
		return enderecoFormatado;

	}

}
