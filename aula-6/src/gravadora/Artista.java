package gravadora;

public class Artista {

	private String nomeArtista;
	private String generoMusical;

	public Artista(String nomeArtista, String generoMusical) {

		setNomeArtista(nomeArtista);
		setGeneroMusical(generoMusical);

	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		if (!nomeArtista.isBlank()) {
			this.nomeArtista = nomeArtista;
		}
	}

	public String getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		if (!generoMusical.isBlank()) {
			this.generoMusical = generoMusical;
		}

	}

	@Override
	public String toString() {

		String dados = """
				*** Informações Artista ***
				nome: %s
				Gênero musical: %s
				""";
		return String.format(dados, nomeArtista, generoMusical);

	}

}
