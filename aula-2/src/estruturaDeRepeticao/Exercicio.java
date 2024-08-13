package estruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do filme a ser avaliado: ");
        String nomeFilme = leitor.nextLine();

        System.out.println("Informe a quantidade de usuários: ");
        int usuarios = leitor.nextInt();

        int[] notas = new int[usuarios];

        for (int i = 0; i < usuarios; i++) {
            System.out.println("Informe a nota do usuário " + (i + 1) + " para o filme " + nomeFilme + ": ");
            notas[i] = leitor.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < usuarios; i++) {
            soma += notas[i];
        }
        
        double media = (double) soma / usuarios;

        System.out.println("A média das notas para o filme '" + nomeFilme + "' é: " + media);
        
    }
}
