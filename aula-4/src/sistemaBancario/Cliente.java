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
		if (!cpfDefinido) {
			cpf = novoCpf;
			cpfDefinido = true;
		} else {
			System.out.println("CPF já foi inserido e não pode ser alterado.");
		}
	}

	public void setProfissao(String novaProfissao) {
		profissao = novaProfissao;
	}

	public void setEndereco(Endereco novoEndereco) {
		endereco = novoEndereco;
	}

	public void setConta(ContaBancaria novaConta) {
		conta = novaConta;
	}
}
