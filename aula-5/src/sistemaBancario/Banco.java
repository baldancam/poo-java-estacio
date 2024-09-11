package sistemaBancario;

import java.util.List;

public class Banco {

	private String nome;
	private Endereco endereco;
	private List<Cliente> clientes;

	public Banco(String nome, Endereco endereco, List<Cliente> clientes) {

		this.nome = nome;
		this.setEndereco(endereco);
		this.clientes = clientes;

	}

	@Override
	public String toString() {

		String dados = "Nome banco: " + (nome) + "\n";

		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			dados += cliente.toString() + "\n";

		}

		return dados;

	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
