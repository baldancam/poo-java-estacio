package gravadora;

public class Musica {

	private String nome;
	private String duracao;
	private Artista artista; // Alterado o nome da variável para uma melhor semântica

	// Construtor que aceita um objeto Artista em vez de nome e gênero
	public Musica(String nome, String duracao, Artista artista) {
		setNome(nome);
		setDuracao(duracao);
		setArtista(artista);
	}

	// Getter e Setter para o nome da música
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("O nome da música não pode ser vazio ou nulo.");
		}
	}

	// Getter e Setter para a duração da música
	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		if (duracao != null && !duracao.isBlank()) {
			// Validação básica para o formato de duração "mm:ss"
			if (duracao.matches("\\d{2}:\\d{2}")) {
				this.duracao = duracao;
			} else {
				throw new IllegalArgumentException("Duração deve estar no formato mm:ss.");
			}
		} else {
			throw new IllegalArgumentException("A duração da música não pode ser vazia ou nula.");
		}
	}

	// Getter e Setter para o objeto Artista
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

		String dadosFormatadosMusica = String.format(dadosMusica, nome, duracao);

		return dadosFormatadosMusica + dadosArtista;
	}

}
