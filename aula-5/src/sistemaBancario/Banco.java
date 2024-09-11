package sistemaBancario;

import java.util.List;

public class Banco {

	private String nome;
	private Endereco endereco;
	private List<Cliente> clientes;

	public Banco(String nome, Endereco endereco, List<Cliente> clientes) {

		this.nome = nome;
		this.endereco = endereco;
		this.clientes = clientes;

	}

	private void addCliente(Cliente cliente) {

		this.clientes.add(cliente);

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

}
