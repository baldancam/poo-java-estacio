
package sistemaBancario;

public class Cliente {

	private String nome;
	private Endereco endereco;
	private String cpf;
	private String profissao;
	private ContaBancaria conta;

	public Cliente(String nome, String cpf, String profissao, Endereco endereco, ContaBancaria conta) {

		setNome(nome);
		setCpf(cpf);
		setProfissao(profissao);
		setEndereco(endereco);
		setConta(conta);

	}

	public Cliente(String nome, String cpf, String profissao, String rua, int numeroEndereco, String cidade, String estado, String cep, String agencia, String numeroConta) {

		setNome(nome);
		setCpf(cpf);
		setProfissao(profissao);
		
		Endereco endereco = new Endereco(rua, numeroEndereco, cidade, estado, cep);		
		ContaBancaria conta = new ContaBancaria(agencia, numeroConta);
		
		this.endereco = endereco;
		this.conta = conta;
		
		
		setEndereco(endereco);
		setConta(conta);

	}

	public void setNome(String nome) {
		if (!nome.isBlank()) {
			this.nome = nome;
		}

	}

	public void setEndereco(Endereco endereco) {
		if (endereco != null) {
			this.endereco = endereco;
		}
	}

	public void setConta(ContaBancaria conta) {
		if (conta != null) {
			this.conta = conta;
		}
	}

	public void setCpf(String cpf) {
		if (cpf.length() == 14 && cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-') {
			this.cpf = cpf;
		}
	}

	public void setProfissao(String profissao) {
		if (!profissao.isBlank()) {
			this.profissao = profissao;
		}

	}

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

	@Override
	public String toString() {

		String dados = """
				*** Dados pessoais ***
				nome: %s
				cpf: %s
				profissão: %s
				*** Dados de endereço ***
				%s
				*** Dados conta bancária ***
				%s
				""";
		String dadosFormatados = String.format(dados, nome, cpf, profissao, endereco.toString(), conta.toString());

		return dadosFormatados;
	}

}
