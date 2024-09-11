package sistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Endereco enderecoJoao = new Endereco("Jose Alfredo", 50, "São José", "Santa Catarina", "88220-000");

		ContaBancaria contaJoao = new ContaBancaria("1234-5", "6543-1");
		contaJoao.depositar(150);

		Cliente joao = new Cliente("Joao Cardosas Filho", "000.000.000-88", "Cientista de Dados", enderecoJoao,
				contaJoao);

		Cliente ana = new Cliente("Ana da Rosa", "001.001.001-55", "Modelo", "Jose Alfredo", 50, "São José",
				"Santa Catarina", "88220-010", "1234-5", "6543-1");

		Endereco enderecoBanco = new Endereco("Leoberto Leal", 550, "São José", "SC", "88070-100");
		
		List <Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(ana);
		clientes.add(joao);
		
		ana.getConta().setAgencia("2222-1");
		
		Banco banco = new Banco("Estacio Bank", enderecoBanco, clientes);
		
		System.out.println(banco);

	}

}
