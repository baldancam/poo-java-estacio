package gravadora;

public class Principal {

    public static void main(String[] args) {

        Artista artista1 = new Artista("Pedro Toca Tudo", "Rock");
        Artista artista2 = new Artista("Maria Melodia", "Pop");

        Musica musica1 = new Musica("Caminhos do Rock", "03:45", artista1);
        Musica musica2 = new Musica("Sonhos Pop", "04:20", artista2);
        Musica musica3 = new Musica("Ritmo da Vida", "02:50", artista1);

        Album album = new Album("Sucessos do Ano", 2024);
        album.adicionarMusica(musica1);
        album.adicionarMusica(musica2);
        album.adicionarMusica(musica3);

        System.out.println(album);
    }
}
