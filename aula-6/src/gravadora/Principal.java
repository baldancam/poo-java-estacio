package gravadora;

public class Principal {

	public static void main(String[] args) {

		Artista pedro = new Artista("Pedro toca tudo", "tudo menos pagode");

		System.out.println(pedro);

		Musica musica = new Musica("Melodia Infinita", "03:45", pedro);

		System.out.println(musica);

	}
}
