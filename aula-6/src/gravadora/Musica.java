package gravadora;

public class Musica {

	private String nomeMusica;
	private String duracao;
	private Artista artista;

	
	public Musica(String nomeMusica, String duracao, Artista artista) {
		setNomeMusica(nomeMusica);
		setDuracao(duracao);
		setArtista(artista);
	}

	
	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		if (nomeMusica != null && !nomeMusica.isBlank()) {
			this.nomeMusica = nomeMusica;
		} else {
			throw new IllegalArgumentException("O nome da música não pode ser vazio ou nulo.");
		}
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		if (duracao != null && !duracao.isBlank()) {
			// Validação para o formato de duração "mm:ss"
			if (duracao.matches("\\d{2}:\\d{2}")) {
				this.duracao = duracao;
			} else {
				throw new IllegalArgumentException("Duração deve estar no formato mm:ss.");
			}
		} else {
			throw new IllegalArgumentException("A duração da música não pode ser vazia ou nula.");
		}
	}

	
	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		if (artista != null) {
			this.artista = artista;
		} else {
			throw new IllegalArgumentException("O artista não pode ser nulo.");
		}
	}

	@Override
	public String toString() {

		String dadosMusica = """
				*** Informações da Música ***
				Nome: %s
				Duração: %s
				""";

		String dadosArtista = artista.toString();

		String dadosFormatadosMusica = String.format(dadosMusica, nomeMusica, duracao);

		return dadosFormatadosMusica + dadosArtista;
	}

}
