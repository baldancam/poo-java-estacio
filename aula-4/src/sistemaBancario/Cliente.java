package sistemaBancario;

public class Cliente {

	private String nome;
	private Endereco endereco;
	private String cpf;
	private String profissao;
	private ContaBancaria conta;
	private boolean nomeDefinido = false;
	private boolean cpfDefinido = false;

	// Getters

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public ContaBancaria getConta() {
		return conta;
	}

	// Setters

	public void setNome(String nomeCliente) {
		if (!nomeDefinido) {
			nome = nomeCliente;
			nomeDefinido = true;
		} else {
			System.out.println("Nome já foi inserido e não pode ser alterado.");
		}
	}

	public void setCpf(String novoCpf) {

		if (novoCpf.length() == 14 && novoCpf.charAt(3) == '.' && novoCpf.charAt(7) == '.'
				&& novoCpf.charAt(11) == '-') {
			if (!cpfDefinido) {
				cpf = novoCpf;
				cpfDefinido = true;
			}
		} else {
			System.out.println("CPF já foi inserido e não pode ser alterado.");
		}
	}

	public void setProfissao(String novaProfissao) {

		if (!novaProfissao.isBlank()) {
			profissao = novaProfissao;
		}

	}

	public void setEndereco(Endereco novoEndereco) {

		if (novoEndereco != null) {
			endereco = novoEndereco;
		}

	}

	public void setConta(ContaBancaria novaConta) {

		if (novaConta != null) {
			conta = novaConta;
		}

	}
	
	@Override
	public String toString() {

		String dados = """
				*** Dados Pessoais ***
				nome: %s
				cpf: %s
				profissão: %s
				*** Dados de endereço ***
				%s
				*** Dados conta bancária***
				%s
				
				""";
		
		String dadosFormatados = String.format(dados, nome, cpf, profissao, endereco.toString(), conta.toString());
		
		return dadosFormatados;
	
	}
	
	
	
}
