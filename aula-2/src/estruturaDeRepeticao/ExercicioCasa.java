package estruturaDeRepeticao;

import java.util.Scanner;

public class ExercicioCasa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String repetir;

		do {

			double objetivo;
			do {
				System.out.println("Informe seu objetivo financeiro: ");
				objetivo = leitor.nextDouble();
				if (objetivo <= 0) {
					System.out.println("O objetivo financeiro deve ser maior que zero. Por favor, insira novamente.");
				}
			} while (objetivo <= 0);

			double poupancaAtual;
			do {
				System.out.println("Informe o valor atual de sua poupança: ");
				poupancaAtual = leitor.nextDouble();
				if (poupancaAtual <= 0) {
					System.out.println("O valor da poupança deve ser maior que zero. Por favor, insira novamente.");
				}
			} while (poupancaAtual <= 0);

			double valorMensal;
			do {
				System.out.println("Informe o valor mensal a poupar: ");
				valorMensal = leitor.nextDouble();
				if (valorMensal <= 0) {
					System.out.println("O valor mensal deve ser maior que zero. Por favor, insira novamente.");
				}
			} while (valorMensal <= 0);

			// Calculo juros
			double juros = 0.5 / 100;

			// Quantidade de meses
			int mesesDecorrido = 1;

			while (poupancaAtual < objetivo) {

				System.out.println("Mês atual: " + mesesDecorrido);
				System.out.println("Saldo atual: " + poupancaAtual);
				double incremento = poupancaAtual * juros;
				poupancaAtual += valorMensal;
				poupancaAtual += incremento;
				mesesDecorrido += 1;

			}
			System.out.println("Mês atual: " + mesesDecorrido);
			System.out.println("Saldo atual: " + poupancaAtual);

			// Pergunta ao usuário se deseja reiniciar com novos valores
			System.out.println("Deseja reiniciar com novos valores? (sim/não)");
			repetir = leitor.next();
 
		} while (repetir.equalsIgnoreCase("sim"));

		System.out.println("Até a próxima :D");

		leitor.close();

	}

}
