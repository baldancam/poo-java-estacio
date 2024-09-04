package sistemaBancario;

public class ContaBancaria {

	private double saldo;
	private String agencia;
	private String numero;

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setAgencia(String novaAgencia) {
		if (novaAgencia.length() == 6 && novaAgencia.charAt(4) == '-') {
			agencia = novaAgencia;
		}

	}

	public void setNumero(String novoNumero) {

		if (novoNumero.length() == 7 && novoNumero.charAt(6) == '-') {
			agencia = novoNumero;
		}
		numero = novoNumero;
	}

	public void depositar(double deposito) {

		saldo = saldo + deposito;

	}

	public boolean sacar(double saque) {

		if (saldo >= saque) {
			saldo = saldo - saque;
			return true;
		} else {
			return false;
		}

	}

	public boolean transferir(double valor, ContaBancaria destino) {

		boolean sacou = this.sacar(valor);
		if (sacou) {
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {

		String dados = """
				saldo: %.2f
				agencia: %s
				numero: %.2f

				""";

		String dadosFormatados = String.format(dados, saldo, agencia, numero);

		return dadosFormatados;

	}

}
