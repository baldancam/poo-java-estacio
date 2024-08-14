package estruturaDeRepeticao;

public class EstruturaDeRepeticao {
	
	public static void main(String[] args) {
		
		int i = 0;

		do {
		    System.out.println("Contador: " + i);
		    i++;
		} while (i <= 5);
		
		
		i = 0;
		
		while (i <= 5) {
			System.out.println("Contador: " + i);
		    i++;
		};
		
		for (int j = 0; j <= 5; j++) {
			System.out.println("Contador: " + j);
		}
	
	};
};