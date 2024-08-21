package sistemaBancario;

public class Principal {

	public static void main(String[] args) {

		ContaBancaria contaAna = new ContaBancaria();

		contaAna.saldo = 1500.5;
		contaAna.numero = "123-3";
		contaAna.agencia = "00111222";

		System.out.println("Saldo da ana = " + contaAna.saldo);
		System.out.println("Agência da ana = " + contaAna.agencia);
		System.out.println("Número da conta = " + contaAna.numero);

		contaAna.depositar(150);

		System.out.println("Saldo da ana = " + contaAna.saldo);

		boolean sacou = contaAna.sacar(350);
		if (sacou == true) {
			System.out.println("\nSaque realizado com sucesso!");
			System.out.println("Saldo da ana = " + contaAna.saldo);
		} else {
			System.out.println("\nSaque não realizado com sucesso!");
		}

		ContaBancaria contaJoao = new ContaBancaria();

		contaJoao.saldo = 1700.5;
		contaJoao.numero = "321-6";
		contaJoao.agencia = "00111222";

		System.out.println("\n\nSaldo da Joao = " + contaJoao.saldo);
		System.out.println("Agência da Joao = " + contaJoao.agencia);
		System.out.println("Número da Joao = " + contaJoao.numero);

		contaJoao.depositar(750);

		System.out.println("Saldo da Joao = " + contaJoao.saldo);

		sacou = contaJoao.sacar(2500);
		if (sacou == true) {
			System.out.println("\nSaque realizado com sucesso!");
			System.out.println("Saldo da ana = " + contaJoao.saldo);
		} else {
			System.out.println("\nSaque não realizado com sucesso!");
		}

	}

}
