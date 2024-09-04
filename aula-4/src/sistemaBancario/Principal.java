package sistemaBancario;

public class Principal {

	public static void main(String[] args) {

		Cliente joao = new Cliente();

		joao.setNome("João Cardoso Filho");
		joao.setCpf("004.555.000-89");

		joao.setProfissao("Motorista");

		Endereco enderecoJoao = new Endereco();
		enderecoJoao.setRua("Rua Domingos Costa");
		enderecoJoao.setNumero(27);
		enderecoJoao.setCidade("São José");
		enderecoJoao.setCep("88190-000");
		enderecoJoao.setEstado("SC");

		joao.setEndereco(enderecoJoao);

		ContaBancaria contaJoao = new ContaBancaria();
		contaJoao.setNumero("99458-8");
		contaJoao.setAgencia("9951-4");
		joao.setConta(contaJoao);

		// -----------------------------

		Cliente ana = new Cliente();

		ana.setNome("Ana Souza");
		ana.setCpf("777.555.333-00");
		ana.setProfissao("Professora");

		Endereco enderecoAna = new Endereco();
		enderecoAna.setRua("Rua Floripa");
		enderecoAna.setNumero(12);
		enderecoAna.setCidade("São Paulo");
		enderecoAna.setCep("88200-000");
		enderecoAna.setEstado("SP");

		ana.setEndereco(enderecoAna);

		ContaBancaria contaAna = new ContaBancaria();
		contaAna.setNumero("12458-8");
		contaAna.setAgencia("4451-4");
		ana.setConta(contaAna);

		// -----------------------------

		System.out.println("Saldo da Ana = " + ana.getConta().getSaldo());
		System.out.println("Agência da Ana = " + ana.getConta().getAgencia());
		System.out.println("Número da conta = " + ana.getConta().getNumero());

		contaAna.depositar(5550);
		System.out.println("Saldo da Ana após depósito = " + ana.getConta().getSaldo());

		boolean sacou = ana.getConta().sacar(350);
		if (sacou) {
			System.out.println("\nSaque realizado com sucesso!");
			System.out.println("Saldo da Ana após saque = " + ana.getConta().getSaldo());
		} else {
			System.out.println("\nSaque não realizado com sucesso!");
		}

		// -----------------------------

		contaJoao.depositar(10750);
		System.out.println("\nSaldo do João = " + joao.getConta().getSaldo());
		System.out.println("Agência do João = " + joao.getConta().getAgencia());
		System.out.println("Número da conta = " + joao.getConta().getNumero());

		sacou = joao.getConta().sacar(2500);
		if (sacou) {
			System.out.println("\nSaque realizado com sucesso!");
			System.out.println("Saldo do João após saque = " + joao.getConta().getSaldo());
		} else {
			System.out.println("\nSaque não realizado!");
		}

		contaJoao.transferir(150, contaAna);
		System.out.println("\nSaldo do João após transferência = " + joao.getConta().getSaldo());
		System.out.println("Saldo atual da Ana após receber transferência = " + ana.getConta().getSaldo());

		// -----------------------------

		System.out.println("\nEndereço do João:");
		System.out.println(joao.getEndereco());

		System.out.println("\nEndereço da Ana:");
		System.out.println(ana.getEndereco());

		// -----------------------------
		
		System.out.println(joao.getCpf());
		
		
		// -----------------------------
		
		

	}
}
