package sistemaBancario;

public class Principal {

	public static void main(String[] args) {

		Cliente joao = new Cliente();
		joao.nome = "João Cardoso Filho";
		joao.profissao = "Motorista";
		joao.cpf = "004.555.000-89";

		Endereco enderecoJoao = new Endereco();

		enderecoJoao.rua = "Rua Domingos Costa";
		enderecoJoao.numero = 27;
		enderecoJoao.cidade = "São José";
		enderecoJoao.cep = "88190-000";
		enderecoJoao.estado = "SC";

		ContaBancaria contaJoao = new ContaBancaria();
		joao.conta = contaJoao;
		joao.endereco = enderecoJoao;

		Cliente ana = new Cliente();
		ana.nome = "João Cardoso Filho";
		ana.profissao = "Motorista";
		ana.cpf = "004.555.000-89";

		Endereco enderecoAna = new Endereco();

		enderecoAna.rua = "Rua Domingos Costa";
		enderecoAna.numero = 27;
		enderecoAna.cidade = "São José";
		enderecoAna.cep = "88190-000";
		enderecoAna.estado = "SC";

		ContaBancaria contaAna = new ContaBancaria();
		ana.conta = contaAna;
		ana.endereco = enderecoAna;

		contaAna.setNumero("12458-8");
		contaAna.setAgencia("4451-4");

		System.out.println("Saldo da ana = " + ana.conta.getSaldo());
		System.out.println("Agência da ana = " + ana.conta.getAgencia());
		System.out.println("Número da conta = " + ana.conta.getNumero());

		contaAna.depositar(5550);

		System.out.println("Saldo da ana = " + ana.conta.getSaldo());

		boolean sacou = ana.conta.sacar(350);
		if (sacou == true) {
			System.out.println("\nSaque realizado com sucesso!");
			System.out.println("Saldo da ana = " + ana.conta.getSaldo());
		} else {
			System.out.println("\nSaque não realizado com sucesso!");
		}

		contaJoao.setNumero("99458-8");
		contaJoao.setAgencia("9951-4");

		contaJoao.depositar(10750);

		System.out.println("\nSaldo da Joao = " + joao.conta.getSaldo());
		System.out.println("Agência da Joao= " + joao.conta.getAgencia());
		System.out.println("Número da conta = " + joao.conta.getNumero());

		sacou = joao.conta.sacar(2500);
		if (sacou == true) {
			System.out.println("\nSaque realizado com sucesso!");
			System.out.println("Saldo da ana = " + joao.conta.getSaldo());
		} else {
			System.out.println("\nSaque não realizado!");
		}

		System.out.println("Saldo conta Ana: " + ana.conta.getSaldo());
		System.out.println("Saldo conta João: " + joao.conta.getSaldo());

		contaJoao.transferir(150, contaAna);
		System.out.println("\nSaldo conta João: " + joao.conta.getSaldo());
		System.out.println("Saldo atual conta Ana: " + ana.conta.getSaldo());

		System.out.println("\n" + joao.endereco);

	}

}
