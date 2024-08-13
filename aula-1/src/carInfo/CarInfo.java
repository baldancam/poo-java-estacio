package carInfo;

import java.util.Scanner;

public class CarInfo {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
                
        String marcaCarro;
        String modeloCarro;
        String corCarro;
        int anoCarro;
        double km;
        
        System.out.println("Informe a marca do carro: ");
        marcaCarro = leitor.nextLine();
        
        System.out.println("Informe o modelo do " + marcaCarro + " :");
        modeloCarro = leitor.nextLine();
        
        System.out.println("Informe a cor do " + modeloCarro + " :");
        corCarro = leitor.nextLine();
        
        System.out.println("Informe o ano do " + modeloCarro + " :");
        anoCarro = leitor.nextInt();
        
        System.out.println("Informe a quilometragem do " + modeloCarro + " :");
        km = leitor.nextDouble();
        
             
        String condicao;
        
        if(anoCarro < 2000) {
        	condicao = "Antigo";
        	if(km >= 150000) {
        		condicao = condicao + " e rodado";
        	}
        }else if(km < 50000){
        	condicao = "Ótimo";
        } else {
        	condicao = "Regular";
        }
        
        
        System.out.println("\nInformações do carro:");
        System.out.println("Marca: " + marcaCarro);
        System.out.println("Modelo: " + modeloCarro);
        System.out.println("Cor: " + corCarro);
        System.out.println("Ano de Fabricação: " + anoCarro);
        System.out.println("Quilometragem: " + km);
        System.out.println("Condição: " + condicao);
       
    }
}
