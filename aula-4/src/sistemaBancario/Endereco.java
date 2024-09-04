package sistemaBancario;

public class Endereco {

	private String rua;
	private int numero;
	private String cep;
	private String cidade;
	private String estado;

	// Getters e Setters
	public String getRua() {
		return rua;
	}

	public void setRua(String ruaEndereco) {

		if (!ruaEndereco.isBlank()) {

			rua = ruaEndereco;
		}

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numeroEndereco) {

		if (numeroEndereco > 0) {

			numero = numeroEndereco;
		}

	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cepEndereco) {

		if (cepEndereco.length() == 9 && cepEndereco.charAt(5) == '-') {

			cep = cepEndereco;
		}

	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidadeEndereco) {

		if (!cidadeEndereco.isBlank()) {

			cidade = cidadeEndereco;
		}

	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estadoEndereco) {

		if (!estadoEndereco.isBlank()) {
			estado = estadoEndereco;
		}

	}

	@Override
	public String toString() {
		String endereco = """
				Rua: %s
				Número: %d
				CEP: %s
				Cidade: %s
				Estado: %s
				""";
		return String.format(endereco, rua, numero, cep, cidade, estado);
	}
}
